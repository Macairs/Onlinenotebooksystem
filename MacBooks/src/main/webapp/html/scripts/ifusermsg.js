//收集用户输入的内容与判断输入的内容是否符合标准
function usermsg(){
		//一下是登录操作
		$("#login").click(function(){
			$("#alert_msg2").html("");
			$("#alert_msg").html("");
			var ok = true;
			//获取用户输入的信息
			//trim是用来去空的
			var names = $("#count").val().trim();
			var passwords = $("#password").val().trim();
			if(names=="" || names==null){
				$("#alert_msg").html("账号不能为空！");
				ok=false;
			}
			if(passwords=="" || passwords==null){
				$("#alert_msg2").html("密码不能为空！");
				ok = false;
			}
			//ajax传值
				if(ok){
	            $.ajax({
	                url: 'http://localhost:8080/MacBooks/shou',
	                type: 'post' ,
//	                contentType: 'application/json;charset=utf-8',加了这个之后会出现传值失败的效果
	                data:{'name':names,'password':passwords},//用这种写法传值不需要上句命令
	                success: function(data){
	                		var stat = data.stat;
	                		var msg = data.msg;
	                		if(stat=="succeed"){
	                				alert(msg);
	                				//绑定参数
	                				localStorage.setItem("UserMsg",data.data.cnUserId);
	                				//获取绑定好的参数
	                				//alert(localStorage.getItem("UserMsg"));
	                				window.location.href="http://localhost:8080/MacBooks/html/edit.html";
	                				
	                		}
	                		if(stat=="fail"){
	                			alert(msg);
	                			window.location.href="http://localhost:8080/MacBooks/html/log_in.html";
	                		}
	                		if(stat=="undata"){
	                			$("#alert_msg").html("账号不存在！");
	                		}
           			}
	                
	            });
				}
	        });
		
	}


function createuser(){
	$("#regist_button").click(function(){
		//用来判断能否进行注册
		var ok = true ;
		//默认隐藏
		$("#warning_1").hide();
		/* $("#warning_2").hide(); */
		var names = $("#regist_username").val().trim();
		var nickname = $("#nickname").val().trim();
		var passwords = $("#regist_password").val().trim();
		var passwordcopy = $("#final_password").val().trim();
		var	paslgh = parseInt(passwords.length);
	 	//判断用户输入的名称是否符合标准
	 	if(names==null || names==""){
	 		$("#warning_1").show();
	 		ok = false ;
	 	}
	 	//判断用户输入的密码是否符合标准
	 	if(0>paslgh || passwords =="" ){
	 		$("#warning_2").show();
	 		ok = false ;
	 	}
	 	//判断两次输入的密码是否相同
	 	if(passwords!=passwordcopy){
	 		$("#warning_3").show();
	 		ok = false ;
	 	}
	 	if(ok){
	 	$.ajax({
	 			url:'http://localhost:8080/MacBooks/createuser',
	 			type: 'post',
	 			data:{'name':names,'password':passwords,'nickname':nickname},
	 			success:function(data){
	 				var stat = data.stat;
	 				if(stat=="fail"){
	 					$("#warning_1").show();
	 					$("#warning_1 span").html("该用户名已存在!");
	 				}
	 				if(stat=="succeed"){
	 					alert("注册成功");
	 					window.location.href="http://localhost:8080/MacBooks/html/log_in.html";
	 				}
	 			}
	 			})
	 	}
	 	
});
}

