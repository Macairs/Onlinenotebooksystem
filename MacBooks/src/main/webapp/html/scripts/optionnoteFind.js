function optionnote(){
	 $("#contactslist").on("click","button",function(){
		 //隐藏操作
		 $(".note_menu").hide();
		 //显示操作
		 //由于自动生成的li对象太多 所以需要遍历(通过this对象获得li然后遍历赋值)
		 var div=$(this).parent().parent().find("div");
		 	 div.slideDown(100);
//		 	 //获取当前时间的秒数
//		 	 var myDate = new Date();             
//		 	 var s=myDate.getSeconds();
//		 	 //jquery的延迟
//		 	 var s1 = setTimeout(s,1000);
		 	 //当鼠标离开后 隐藏div
		 	$(div).mouseleave(function(){ $(".note_menu").hide();});
	});
}
function Notebackg(){
	$("#contactslist").on("click","a",function(){
		//渲染a标签前先取消之前的设置（这里设置统一删除）
		 $("#contactslist a").removeClass("checked");
		 //点击后渲染一下a标签
		 $(this).addClass("checked");
		
	});
	
}
