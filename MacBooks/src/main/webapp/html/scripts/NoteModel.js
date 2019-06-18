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
		var userid = localStorage.getItem("UserMsg");
		$.ajax({
			url:'http://localhost:8080/MacBooks/delnote',
			type:'post',
			data:{'userId':userid},
			success:function(data){
				
			}
		});
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
				alert(noteid);
			});
		});
		
	})
}