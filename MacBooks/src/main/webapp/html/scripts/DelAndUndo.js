//删除操作
function Deloperation(){
	$("#contacts-list").on("click",".btn_delete",function(){
		$('#can').load('./alert/alert_delete_rollback.html',function(){
			$('.opacity_bg').show();
			//x按钮
			$("#modal").click(function(){
				$("#can #modalBasic_10").hide();
				$('.opacity_bg').hide();
			});
			
			//取消按钮
			$("#modals").click(function(){
				$("#can #modalBasic_10").hide();
				$('.opacity_bg').hide();
			});
			 //继续按钮
			$("#Delsure").click(function(){
				var id = $("#contacts-list .btn_delete").attr("delnote");
				//用户Id
				var userid = localStorage.getItem("UserMsg");
				//重置一下 li
				$("#contacts-list").empty();
				$.ajax({
					url:'http://localhost:8080/MacBooks/updatenote',
					type:'post',
					data:{'Noteid':id},
					success: function(datas){
						if(datas==1){
							alert("删除成功!");
							refresh(userid);
							$("#can #modalBasic_10").hide();
							$('.opacity_bg').hide();
						}else{
							alert("删除失败!")
						}
					}
				})
			}); 
		});
	})
	
	//------------------
	//赋值给X按钮(还有其他办法，但是我懒了 所以就用这个办法了)
	$("#contacts-list").on("click","a",function(){
		var id = $(this).attr("noteids");
		$("#contacts-list .btn_delete").attr("delnote",id);
		$("#contacts-list .btn_replay").attr("btnreplay",id);
	})
}


//撤销操作
function ounull(){
	$("#contacts-list").on("click",".btn_replay",function(){
		$('#can').load('./alert/alert_replay.html',function(){
			$('.opacity_bg').show();
			//X按钮操作
			$("#modal").click(function(){
				$("#can #modalBasic_3").hide();
				$('.opacity_bg').hide();
			});
			
			//取消按钮操作
			$("#modals").click(function(){
				$("#can #modalBasic_3").hide();
				$('.opacity_bg').hide();
			});
			
			//恢复按钮
			$("#sure").click(function(){
				//通过UserId来更新回收站的（笔记区）
				var userid = localStorage.getItem("UserMsg");
				//获取select的option的值用来判断要保存到那个文件夹
				var model = $("#modalBasic_3 #replaySelect").val();
				//获取笔记id
				var demoid = $("#contacts-list .btn_replay").attr("btnreplay");
				$.ajax({
					url:'http://localhost:8080/MacBooks/undooper',
					type:'post',
					data:{'Noteid':demoid,'model':model},
					success:function(datas){
						if(datas==1){
							alert("已经恢复至默认笔记");
							$("#can #modalBasic_3").hide();
							$('.opacity_bg').hide();
							//重置一下 Ul列表 然后在输出
							$("#contacts-list").empty();
							refresh(userid);
						}
					}
				})
			});
		});
	})
}