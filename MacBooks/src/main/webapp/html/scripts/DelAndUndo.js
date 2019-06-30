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
						if(datas.msg=="1"){
							alert("已经恢复至默认笔记");
							$("#can #modalBasic_3").hide();
							$('.opacity_bg').hide();
							//重置一下 Ul列表 然后在输出
							$("#contacts-list").empty();
							refresh(userid);
						}
						if(datas.msg=="2"){
							alert("收藏笔记");
						}
						if(datas.msg=="3"){
							alert("参加活动笔记");
							$("#can #modalBasic_3").hide();
							$('.opacity_bg').hide();
						}
					}
				})
			});
		});
	})
}



//显示参加活动笔记的方法
function shownote(noteid){
	$("#action_button").click(function(){
		$("#activit").empty();
		var userid  = localStorage.getItem("UserMsg");
		$.ajax({
			url:'http://localhost:8080/MacBooks/getcnnotevo',
			type:'post',
			data:{'userid':userid},
			success:function(datas){
				var dataslen = datas.length;
				for(var i = 0 ;i<dataslen ;i++ ){
					var title = datas[i].activitys.cnNoteActivityTitle;
					var activid = datas[i].activitys.cnNoteActivityId;
					if(title!=null && activid!=null){
						shownotemsg(activid,title);
					}
				}
			}
		});
	});
}
//显示参加活动笔记的方法(通过获得的noteid查询信息)
function shownotemsg(noteids,notetitle){
	var li = '<li class="idle"><a ><i class="fa fa-file-text-o" title="online" rel="tooltip-bottom"></i>'+notetitle+'<button type="button" class="btn btn-default btn-xs btn_position btn_delete"><i class="fa fa-times"></i></button></a></li>';
	$("#activit").append(li);
	$("#activit a").last().attr("activitnoteid",noteids);
}