function createnote(){
	$("#add_note").click(function(){
		//引入
		$('#can').load('./alert/alert_note.html',function(){
			$('.opacity_bg').show();
			//x按钮
			$("#clone_x").click(function(){
				$("#can #modalBasic_2").hide();
				$('.opacity_bg').hide();
			});
			//取消按钮
			$("#clone_cancle").click(function(){
				$("#can #modalBasic_2").hide();
				$('.opacity_bg').hide();
			});
			//保存按钮
			$("#sure").click(function(){
				//获取保存的userid
				var userid = localStorage.getItem("UserMsg");
				//获取保存的notebookid
				 var notebookid = $("#loginNote a.checked").attr("bookids");
				//标记用来判断是否符合要求
				var ok = true;
				//提示默认隐藏
				$("#plos").hide();
				var NoteName = $("#input_note").val().trim();
				if(NoteName==null || NoteName ==""){
					//满足条件 提示会出现
					$("#plos").show();
					ok=false;
				}
				if(ok){
					$.ajax({
						url:'http://localhost:8080/MacBooks/createnote',
			  			type:'post',
			  			data:{'notebookid':notebookid,'notename':NoteName,'userid':userid},
			  			success: function(datas){
			  				if(datas==1){
			  					 $("#contactslist").empty();
								 //在从新加载笔记（这样做就能实现动态刷新了）
			  					LoginNote(notebookid);
			  					$("#can #modalBasic_2").hide();
								$('.opacity_bg').hide();
			  				}else{
			  					alert(false)
			  				}
			  			}
					})
				}
			});
		});
	});
}

//增加后刷新笔记区
function LoginNote(notebookid){
	$.ajax({
			url:'http://localhost:8080/MacBooks/NoteMsg',
			type:'post',
			data:{'notebookid':notebookid},//为避免不必要的麻烦键的名字要与controller的一致
			success: function(datas){
				var leng = datas.data.length;
				for(var i = 0 ; i<leng ;i++ ){
					var notename =  datas.data[i].cnNoteTitle;
					var noteid = datas.data[i].cnNoteId;
					//创建 li以及绑值
					createli(notename,noteid);
				}
			}
	})
}