package com.qfedu.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.pojos.CnUser;
import com.qfedu.utli.returngeneral;

@Controller
public class usermsgcontroller {
	/* @RequestParam 用来设置属性的相关信息
	 * required 设置属性是否可选  默认true(不可选)
	 * 
	 * */
	//以下是登入操作
	@Resource
	private com.qfedu.service.usermsg message;
	@RequestMapping(value = "/shou",method = RequestMethod.POST)
	@ResponseBody
	public returngeneral<CnUser> usermsg(@RequestParam(value="name",required = true) String name,@RequestParam(value="password",required = true) String password) {
			
		return message.list(name, password);
	}
	
	//以下是注册操作
	@RequestMapping(value="/createuser")
	@ResponseBody
	public returngeneral<CnUser> CreateUser(@RequestParam(value="name",required = true) String name,@RequestParam(value="password",required = true) String password,
			@RequestParam(value="nickname",required = false) String nickname){
			returngeneral<CnUser> createmsg = message.create(name, password, nickname);
			return createmsg;
	}
}
