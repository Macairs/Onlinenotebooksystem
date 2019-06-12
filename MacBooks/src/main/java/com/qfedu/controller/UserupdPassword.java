package com.qfedu.controller;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.qfedu.dto.QueryExpansion;
import com.qfedu.service.selUserPassword;


@Controller
public class UserupdPassword {
	//注入查询密码的password
	@Autowired
	private selUserPassword selpaws;
	@RequestMapping(value="/selectpassword")
	@ResponseBody
	public QueryExpansion UserPassword(@RequestParam(value="password",required = true)String password,
			@RequestParam(value="UserId",required = true)String UserId,
			@RequestParam(value="coppassword",required = true)String coppassword){
		
		return selpaws.Selectpassword(password, UserId, coppassword);
	}
}
