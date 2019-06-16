function NoteBookCrud(){
	$("#add_notebook").click(function(){
		//弹出CreateNoteBook的边框
		$('#can').load('./alert/alert_notebook.html',function(){
			//背景变黑用的（这里是显示）
			$('.opacity_bg').show();
			//这个是X按钮的操作
			$("#close").click(function(){
				//用来实现关闭新增页框的操作
				$("#can #modalBasic").hide();
				//背景变黑用的（这里是隐藏）
				$('.opacity_bg').hide();
			});
			
			//这里是取消按钮的操作
			$("#modal").click(function(){
				//用来实现关闭新增页框的操作
				$("#can #modalBasic").hide();
				//背景变黑用的（这里是隐藏）
				$('.opacity_bg').hide();
			});
			
			
			//这里是添加按钮
			$("#save").click(function(){
				//获取当前登录的用户Id
				var ThisUserID = localStorage.getItem("UserMsg");
				//点击后恢复隐藏的效果
				$("#alertspan").css("display","none");
				var ok = true;
				var notebookname = $("#input_notebook").val().trim();
				if(notebookname=="" || notebookname==null){
					ok=false;
					//点击后显示
					$("#alertspan").css("display","block");
				}
				
				if(ok){
					$.ajax({
						url:'http://localhost:8080/MacBooks/createnotebook',
			  			type:'post',
			  			data:{'NoteBookName':notebookname,'UserId':ThisUserID},
						success: function(datas){
							if(datas==1){
								//用来实现关闭新增页框的操作
								$("#can #modalBasic").hide();
								//背景变黑用的（这里是隐藏）
								$('.opacity_bg').hide();
								//用来重置列表（这里的思路是先清空在显示）
								 $("#loginNote").empty();
								 //在从新加载
								 loginBookTitle();
							}
						}
					});
				}
			});
		});
	
});
}