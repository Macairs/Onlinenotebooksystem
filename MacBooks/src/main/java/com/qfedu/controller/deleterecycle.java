package com.qfedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class deleterecycle {
	@RequestMapping(value="/delnote",method = RequestMethod.POST)
	@ResponseBody
	public void GetDelRecy(@RequestParam(value="userId",required = true) String userId){
		System.out.println(userId);
	}
}
