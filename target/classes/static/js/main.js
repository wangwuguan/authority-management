//JavaScript代码区域
  function show() {
		var date = new Date();
		var year = date.getFullYear();
		var month = date.getMonth() + 1;
		var day = date.getDate();
		var h = date.getHours();
		var m = date.getMinutes();
		var s = date.getSeconds();
		var str = year + "年" + month + "月" + day + "日" + " " + h + "时" + m
				+ "分" + s + "秒";
		document.getElementById("showTime").innerHTML = str;
		var b = setTimeout("show()", 1000);
	}
	window.onload = show;
	
layui.use(['element', 'layer'], function(){
  var element = layui.element
  ,layer = layui.layer;
  

  
  /* 获取一级菜单列表  */
  $.ajax({
	  url:"/menu/menuOne",
	  type:"post",
	  dataType:"json",
	  async:false,
	  success:function(data){
		 /*  layer.alert(JSON.stringify(data)); */
		  menuOne(data);
	  },
	  error:function(data){
		  layer.alert("错误");
	  }
	  //layui-icon-home
  });
       
  /* 菜单拼接  */
  function menuOne(data) {
	  var list = "";
	  for (var i = 0; i < data.length; i++) {
		if(data[i].murl=="null"){
			list+="<li><a href='javascript:;'><i class='layui-icon "+data[i].icon+"'style='font-size: 18px;"+
			" color: #222;''></i><cite>"+data[i].mname+"</cite><i class='iconfont nav_right'>&#xe697;</i></a><ul class='sub-menu'>";	
			/* 获取二级菜单 */
			$.ajax({
				  url:"/menu/menuTwo",
				  data:{"id":data[i].mid},
				  type:"post",
				  async:false,
				  dataType:"json",
				  success:function(data2){
					  /* layer.alert(JSON.stringify(data)); */
					  for (var i = 0; i < data2.length; i++) {				
						 list+="<li><a _href='"+data2[i].murl+"'>"+
	    					"<i class='iconfont'>&#xe6a7;</i><cite>";	
						 list+=data2[i].mname;
						 list+="</cite></a></li>";
					  }
				  },
				  error:function(data2){
					  layer.alert("错误");
				  }
			});
			list+="</ul></li>";
		}
  	}
	$("#nav").append(list);
  }
  
}); 