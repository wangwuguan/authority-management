/*
 * required（必填项）
 * phone（手机号）
 * email（邮箱）
 * url（网址）
 * number（数字）
 * date（日期）
 * identity（身份证）
 * 自定义值
 */

layui.use(['form','layer'], function(){
	  var form = layui.form
	  ,layer = layui.layer;
	  
	  //自定义验证规则
	  form.verify({
		    //用户名验证
		  	username: function(value, item){ //value：表单的值、item：表单的DOM对象
		  		if(value.trim().length < 2){
			        return '用户名至少2个字符';
			    }
		  		if(!new RegExp("^[a-zA-Z0-9_\u4e00-\u9fa5\\s·]+$").test(value)){
		  	      return '用户名不能有特殊字符';
		  	    }
		  	    if(/(^\_)|(\__)|(\_+$)/.test(value)){
		  	      return '用户名首尾不能出现下划线\'_\'';
		  	    }
		  	    if(/^\d+\d+\d$/.test(value)){
		  	      return '用户名不能全为数字';
		  	    }  
		  	  }
		  	//密码验证
		    ,pass:[ /^[\S]{6,12}$/ ,'密码必须6到12位，且不能出现空格'] 
		    //重复密码验证
		    ,repass: function(value){
		        if($('#L_pass').val()!=$('#L_repass').val()){
		            return '两次密码不一致';
		        }
		    }
		    //邮箱自定义验证
            ,myEmail: [/^\s*$|^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*\.[a-zA-Z0-9]{2,6}$/, "邮箱格式不正确"]
            //登录名验证
            ,strSize: [/^[\S]{4,15}$/, "长度为4-15"]
            //密码验证(2)
            ,updSize: [/^\s*$|^[\S]{4,15}$/, "长度为4-15"]
            //1到30正整数的正则表达式：^([12][0-9]|30|[1-9])$
            ,monthDay:[/^([12][0-9]|30|[1-9])$/,"请输入1-30的正整数"]
            //身份证号
            ,reg : [/^(\d{16}|\d{19})$/,'银行账号不正确']
            //验证银行卡号  16-19位
            ,bankno: function(value){
		        if(!(/^[0-9]{16,19}$/.test(value))){
		            return '请输入正确的银行卡号';
		        }
		    }
            //原始密码验证
            ,originalPsd: function(value){
		         if($('#upsd').val()!=$('#psd').val()){
		             return '原密码输入错误';
		         }
		      }
		    //角色名唯一性验证
            ,roleName: function(value,item){ //value：表单的值、item：表单的DOM对象
            	//ajax同步请求
            	var checkResult = "";
                $.ajax({
                	url: "/role/isExistRoleName",
                    type: "post",
                    cache:false,
                    data:{
                        rname: $("#rname").val(),
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
            //菜单名唯一性验证
            ,menuName: function(value,item){ //value：表单的值、item：表单的DOM对象
            	//ajax同步请求
            	var checkResult = "";
                $.ajax({
                	url: "/menu/isExistMenuName",
                    type: "post",
                    cache:false,
                    data:{
                        mname: $("#mname").val(),
                    },
                    async:false,
                    success: function (data) {
                        if (data=="fail") {
                        	checkResult = "菜单名已存在" ;
                        } 
                    }

                });
                return checkResult;
            }
            
            
	  });  
                 
});