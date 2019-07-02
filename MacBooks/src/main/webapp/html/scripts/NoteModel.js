function model(){
	
	//点击笔记本时调回原来的全部笔记
	$("#loginNote").on("click","a",function(){
		$("#pc_part_2").show();
		$("#pc_part_4").hide();
		$("#pc_part_7").hide();
		$("#pc_part_8").hide();
	})
	//pc_part_2
	//打开回收站
	$("#rollback_button").click(function(){
		//处理模块之间的切换
		$("#pc_part_2").hide();
		//收藏模块
		$("#pc_part_7").hide();
		//参加活动模块
		$("#pc_part_8").hide();
		//收藏笔记模块
		$("#pc_part_4").show();
		//------------
		//显示前先清空一下之前生成的
		$("#contacts-list").empty();
		
		var userid = localStorage.getItem("UserMsg");
		refresh(userid);
	});
	
	//打开收藏笔记本
	$("#like_button").click(function(){
		//处理模块之间的切换
		//收藏模块
		$("#pc_part_4").hide();
		//笔记模块
		$("#pc_part_2").hide();
		//参加活动模块
		$("#pc_part_8").hide();
		$("#pc_part_7").show();
	});
	
	//打开参加活动笔记本
	$("#action_button").click(function(){
		$("#pc_part_2").hide();
		$("#pc_part_4").hide();
		$("#pc_part_7").hide();
		$("#pc_part_8").show();
	});
}




//伪删除操作
function PseudoDelNote(){
	$("#contactslist").on("click",".btn_delete",function(){
		$('#can').load('./alert/alert_delete_note.html',function(){
			$('.opacity_bg').show();
			//取消按钮
			$("#modal").click(function(){
				$('.opacity_bg').hide();
				$("#can #modalBasic_7").hide();
			});
			//X按钮
			$("#modalx").click(function(){
				$('.opacity_bg').hide();
				$("#can #modalBasic_7").hide();
			});
			//删除按钮
			$("#sure").click(function(){
				var noteid = $("#contactslist a.checked").attr("lidata");
					$.ajax({
						url:'http://localhost:8080/MacBooks/pseudodel',
						type:'post',
						data:{'noteid':noteid},
						success:function(datas){
							if(datas==1){
								alert("删除成功");
								$('.opacity_bg').hide();
								$("#can #modalBasic_7").hide();
								$("#contactslist a.checked").hide();
							}else{
								alert("删除失败");
							}
						}
						
					})
			});
		});
		
	})
}



//动态生成li列表(这是三个功能区的li,回收站的)
function autoaddli(notename,noteid){
	var li = '<li class="disable"><a ><i class="fa fa-file-text-o" title="online" rel="tooltip-bottom"></i> '+notename+'<button type="button" class="btn btn-default btn-xs btn_position btn_delete"><i class="fa fa-times"></i></button><button type="button" class="btn btn-default btn-xs btn_position_2 btn_replay"><i class="fa fa-reply"></i></button></a></li>';
	$("#contacts-list").append(li);
	$("#contacts-list a").last().attr("noteids",noteid);
	
}

//回收站li的刷新操作
function refresh(userid){
	$.ajax({
		url:'http://localhost:8080/MacBooks/delnote',
		type:'post',
		data:{'userId':userid},
		success:function(datas){
			var len  = datas.data.length;
			for(var i = 0 ; i<len;i++ ){
				var notename = datas.data[i].cnNoteTitle;
				var noteid = datas.data[i].cnNoteId;
				autoaddli(notename,noteid);
			}
		}
	});
}

//回收站A标签的点击函数
function contacts_a(){
	$("#contacts-list").on("click","a",function(){
		var noteid = $(this).attr("noteids");
		publicajax(noteid);
	})
}