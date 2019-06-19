package com.qfedu.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.qfedu.daos.CnNoteMapper;
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
		int count = pseudodels.PseuDodel(noteid);
		return count ; 
	}
	
	//笔记真正删除的操作
	@RequestMapping(value="/updatenote",method = RequestMethod.POST)
	@ResponseBody
	public Integer DelNote(@RequestParam(value="Noteid",required = true) String Noteid) {
		Integer count = pseudo.DelNote(Noteid);
		return count;
	}
	//撤销操作
	@Resource(name="cnNoteMapper")
	private CnNoteMapper notemapp;
	@RequestMapping(value = "/undooper",method = RequestMethod.POST)
	@ResponseBody
	public Integer undooper(@RequestParam(value="Noteid",required = true) String Noteid,
							@RequestParam(value="model",required = true) String model) {
		//标记，用来给前端做判断的
		Integer count = 0 ;
		if("default".equals(model)) {
			//分类到默认笔记
			CnNote notes = new CnNote();
			notes.setCnNoteStatusId("1");
			notes.setCnNoteId(Noteid);
			notemapp.updateByPrimaryKeySelective(notes);
			count = 1;
		}else if("colls".equals(model)){
			System.out.println("收藏笔记");
			count = 2;
		}else if("activ".equals(model)) {
			System.out.println("参加活动笔记");
			count = 3;
		}else{
			System.out.println("操作失败，无效操作");
			count = 0;
		}
		
		return count;
	}
}
