//角色权限展示页面所用的js
layui.use(['table','form','element'], function(){
	  var table = layui.table,
	  form = layui.form,
	  element = layui.element;
	  
	  //数据获取
	  table.render({
		/* id:"uid",//可以在这里设置需要隐藏的列的字段名，如果是要隐藏多列的话这样写 id:'id,sex' */
	    elem: '#test'
	    ,url:'/role/selectRole'
	    ,title: '用户数据表'
	    ,cols: [[
	      {type: 'numbers', title: '编号',fixed: 'left'}
	      ,{field:'rid', title: '角色ID',sort: true,  totalRow: true }
	      ,{field:'rname', title: '角色名称' }
	      ,{field:'rdesc', title: '角色描述' }
	      ,{field:'rtime', title: '角色创建时间' }
	      ,{field:'rstatename', title: '角色状态', width: 135,  totalRow: true, templet: '#stateTpl'}
	      ,{fixed: 'right', title: '操作', width: 360, align:'center', toolbar: '#barDemo'}
	    ]]
	    ,page: true
	  });
	  
	  //自定义验证规则
	  form.verify({
		  //角色名唯一性验证
          roleName2: function(value,item){ //value：表单的值、item：表单的DOM对象
          	//ajax同步请求
          	var checkResult = "";
              $.ajax({
              	url: "/role/isExistRoleName",
                  type: "post",
                  cache:false,
                  data:{
                      rname: $("#rname2").val(),
                      rid: $("#rid2").val()
                  },
                  async:false,
                  success: function (data) {
                      if (data=="fail") {
                      	checkResult = "角色名已存在" ;
                      } 
                  }

              });
              return checkResult;
          }
	  });

	  //监听行工具事件
	  table.on('tool(test)', function(obj){
	    var data = obj.data;
	    //角色禁用操作
	    if(obj.event === 'stop'){
	    	layer.confirm('确定修改该角色状态？', function(index){
	    		if (data.rid == 1) {
	    			layer.msg("超级管理员不能禁用");
	    			return;
	    		}
	        	//异步操作，修改员工状态
	        	$.ajax({
	        		url:"/role/updateRoleState",
	              	data:{"rid":data.rid,"rstate":data.rstate},
	              	type:"post",
	              	success:function(datas){
	              		if (datas=="success") {
	              			table.reload("test");
	              			if (data.rstate==1) {
	              				layer.msg("角色已被禁用");
							} else {
								layer.msg("角色已被启用");
							}
	              		} else {
	              			layer.msg("角色状态修改失败");
	              		}
	              	},
	              	error:function(){
	              		layer.alert("修改错误");
	              	}
	        	});	        	
	        });
	      } else if(obj.event === 'edit'){
	    	//编辑事件
	    	$("[name='rid']").val(data.rid);
	    	$("[name='rname']").val(data.rname);
	    	$("[name='rdesc']").val(data.rdesc);
	    	//打开模态框
	    	layer.open({
                type:1,//类型
                area:['500px','300px'],//定义宽和高
                title:'查看详细信息',//题目
                shadeClose:false,//点击遮罩层关闭
                content: $('#motaikuang')//打开的内容
            });	
	    } else if(obj.event === 'accredit'){
	    	$("[name='rid']").val(data.rid);
	    	//获取树形菜单结构的值
	    	//打开模态框
	    	layer.open({
                type:1,//类型
                area:['460px','600px'],//定义宽和高
                title:'角色授权',//题目
                shadeClose:false,//点击遮罩层关闭
                content: $('#accreditRole')//打开的内容
            });
	    	
	    	//菜单树形结构赋值
			var xtree = new layuiXtree({
			      elem: 'xtree'  //(必填) 放置xtree的容器id，不要带#号
			      , form: form    //(必填) layui 的 from
			       , data: '/menu/menuTree?rid='+$("#roleid").val() //(必填) 数据接口，需要返回以上结构的json字符串（数据格式在下面）
			});
	    	
			//监听授权模块提交
	        form.on('submit(accreditRole)', function(data){ 
	        		var rid = data.field.rid;
		           	var formData = xtree.GetChecked();
		           	var mids = "1,";
		            for (var i = 0; i < formData.length; i++) {
	                    /* console.log(formData[i].value); */
	                    if (i==formData.length-1) {
	                    	mids += formData[i].value;
		           			break;
						}
	                    mids += formData[i].value+",";
	                } 
		            /* layer.alert(JSON.stringify(mids)); */
		 		    //发异步，把数据提交
	 		   	    $.ajax({
	             	url:"/role/accreditRole",
	             	data:{rid:rid,mids:mids},
	             	type:"post",
	             	success:function(datas){
	             		if (datas=="success") {
	             			//关闭弹框
	                 		layer.close(layer.index);
	                 		/* layer.closeAll(); */
	             			//更新数据，重新渲染，无返回值
	             			xtree.render();	            
	                        layer.msg("修改成功");	
	                        //延时加载
	                        /*window.setTimeout(function(){
	                        	//刷新父页面
		              			window.parent.location.reload();
		   				    },1500);*/
	 					} else {
	 						layer.closeAll();
	 						layer.msg("修改失败");	
	 					}
	             	},
	             	error:function(){
	             		layer.msg("添加错误");
	             	}
	             }); 
	             //必不可少
	             return false;
	        });
	    	 	
	    }  
	  });
	  
	  //监听编辑模块修改提交
	  form.on('submit(update)', function(data){ 
		//整合表单数据
	    var formData = data.field;
	    /* layer.alert(JSON.stringify(formData)); */
	    //发异步，把数据提交
	    $.ajax({
          	url:"/role/updateRole",
          	data:formData,
          	type:"post",
          	success:function(datas){
          		if (datas=="success") {	 
          			layer.close(layer.index);
                    table.reload("test");
                    layer.msg("修改成功");	  
          		}
          	},
          	error:function(){
          		layer.msg("添加错误", {icon: 6});
          	}
          });
          //必不可少
          return false;
        });	  
		
	});
	
	//模糊查询刷新页面
	function searchRole(){
	  layui.use('table', function(){
		  var table = layui.table;
		  var rid = $("#rid").val();
		  var rname = $("#rname").val();
		  table.reload('test', {
			  url: '/role/selectRole'
			  /* ,method:"post" */
			  ,where: {
				  rid:rid,
				  rname:rname
			  } //设定异步数据接口的额外参数
			  ,page: {
	  			 	curr: 1 //重新从第 1 页开始
	 			  }
			});
	  });		
	}
	
	//重新刷新form表单
	layui.use('form', function(){  //此段代码必不可少
	    var form = layui.form;
	    form.render();
	});
	