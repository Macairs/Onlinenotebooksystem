package com.qfedu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.aop.TransactionAdvice;
import com.qfedu.interfacecallback.DataMsgImpl;
import com.qfedu.service.testaops;

@Controller
public class SelectActivityAOP {
	@Resource(name="testaopsimpl")
	private testaops aops;
	@RequestMapping(value="/selactivityaop")
	@ResponseBody
	public String SelectActivity(@RequestParam(value="noteid",required = true)String noteid) {
		DataMsgImpl msg = new DataMsgImpl(new TransactionAdvice());
		msg.setData(noteid);
		aops.testselect();
		return null;
	}
}
