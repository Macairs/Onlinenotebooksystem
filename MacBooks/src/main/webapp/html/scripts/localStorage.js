function localQue(){
			//用户登入状况
			var cookets = localStorage.getItem("UserMsg");
		//判断用户是否在登录状况
			if(cookets==null){
				alert("请重新登录~");
				 window.location.href="http://localhost:8080/MacBooks/html/log_in.html";
			}
		//设置localstorage 销毁时间
		
			//退出功能
			$("#logout").click(function(){
				localStorage.removeItem('UserMsg');
				alert("退出成功~")
				 window.location.href="http://localhost:8080/MacBooks/html/log_in.html";
			});
}