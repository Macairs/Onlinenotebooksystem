package com.qfedu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.service.UpdateNoteMsg;
//修改笔记信息的@Controller
@Controller
public class updateNoteMsg {
	
	/* 相关属性:
	 * NodeId
	 * MsgBody
	 * MsgTitle
	 * */
	@Resource
	private UpdateNoteMsg NoteService;
	@RequestMapping(value="/updnotemsgs",method = RequestMethod.POST)
	@ResponseBody
	public String UpdNote(@RequestParam(value="NoteId",required = true) String NoteId,
		 @RequestParam(value="NodeBody",required = true)String NodeBody,
		 @RequestParam(value="NodeTitle",required = true)String NodeTitle){
		System.out.println(NoteId+"----"+NodeBody+"------"+NodeTitle);
		NoteService.UpdNote(NoteId, NodeBody, NodeTitle);
		return "true";
	}
}
