function optionnote(){
	 $("#contactslist").on("click","button",function(){
		 //隐藏操作
		 $(".note_menu").hide();
		 //显示操作
		 //由于自动生成的li对象太多 所以需要遍历(通过this对象获得li然后遍历赋值)
		 var div=$(this).parent().parent().find("div");
		 	 div.slideDown(100);
		 	$(div).mouseleave(function(){ $(".note_menu").hide();});
	});
}
//获取内容以及输出的方法
function Notebackg(){
	$("#contactslist").on("click","a",function(){
		//渲染a标签前先取消之前的设置（这里设置统一删除）
		 $("#contactslist a").removeClass("checked");
		 //点击后渲染一下a标签
		 $(this).addClass("checked");
		 var noteid = $(this).attr("lidata");
		 //把获取得到的值绑定给button方便后续传值以便完成Note的CRUD操作
		 $("#save_note").attr("btnmsg",noteid);
		 $.ajax({
			 url:'http://localhost:8080/MacBooks/NoteCrud',
			 type:'post',
			 data:{'noteid':noteid},
			 success: function(datas){
				var notetitle =  datas.data.cnNoteTitle;
				//获取note的内容
				var notebody  =  datas.data.cnNoteBody;
				//将notetitle输出到 title框
				$(".row .col-xs-8 #input_note_title").val(notetitle);
				//将信息输出到编辑框
				$("#myEditor").html(notebody);
			 }
		 });
	});
}

//btn处理note的update修改操作
function buttonmsg(){
	$("#save_note").click(function(){
		//获取输入的title标题
		var notetitle = $(".row .col-xs-8 #input_note_title").val();
		//获取输入的文档值
		var notebody = $("#myEditor").text();
		//获取绑定的noteid
		var noteid = $(this).attr("btnmsg");
		$.ajax({
			 url:'http://localhost:8080/MacBooks/updnotemsgs',
			 type:'post',
			 data:{'NoteId':noteid,'NodeBody':notebody,'NodeTitle':notetitle},
			 success: function(datas){
				
			 }
		 });
	});


}