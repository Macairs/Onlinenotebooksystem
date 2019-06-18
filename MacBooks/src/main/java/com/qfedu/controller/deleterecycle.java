package com.qfedu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.pojos.CnNote;
import com.qfedu.serviceimpl.PseudoDelImpl;
import com.qfedu.serviceimpl.UpdateNoteImpl;
import com.qfedu.utli.returngeneral;

@Controller
public class deleterecycle {
	//回收站操作
	@Resource(name="pseudoDelImpl")
	private PseudoDelImpl pseudo;
	//伪删除处理的service
	@Resource(name="updateNoteImpl")
	private UpdateNoteImpl pseudodels;
	@RequestMapping(value="/delnote",method = RequestMethod.POST)
	@ResponseBody
	public returngeneral<List<CnNote>> GetDelRecy(@RequestParam(value="userId",required = true) String userId){
		System.out.println(userId);
		returngeneral<List<CnNote>> l = pseudo.PseudoDelNote(userId);
		return l;
	}
	
	//伪删除操作
	@RequestMapping(value="/pseudodel",method = RequestMethod.POST)
	@ResponseBody
	public Integer pseudodel(@RequestParam(value="noteid",required = true) String noteid) {
		System.out.println(noteid);
		int count = pseudodels.PseuDodel(noteid);
		return count ; 
	}
}
