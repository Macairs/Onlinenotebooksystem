package com.qfedu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.serviceimpl.CreatenoteBookimpl;

@Controller
public class CreateNoteBookMsg {
	//添加笔记本操作
	/* NoteBookName笔记本名称
	 * UserId用户Id
	 * */
	@Resource
	private CreatenoteBookimpl createnotebook;
	
	@RequestMapping(value="/createnotebook",method = RequestMethod.POST)
	@ResponseBody
	public int CreateNoteBookDao(@RequestParam(value="NoteBookName",required = true)String NoteBookName,@RequestParam(value="UserId",required = true)String UserId) {
		return createnotebook.CreateNotebook(NoteBookName, UserId);
	}
}
