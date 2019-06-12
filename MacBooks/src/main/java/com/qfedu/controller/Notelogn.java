package com.qfedu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.qfedu.pojos.CnNote;
import com.qfedu.service.SelNoteBook;
import com.qfedu.utli.returngeneral;

@Controller
public class Notelogn {
	//以下是查询笔记本信息的service
	@Resource
	private SelNoteBook booksel;
	@RequestMapping(value="/notelogn",method = RequestMethod.POST)
	@ResponseBody
	public returngeneral<List<CnNote>> GetNodeMsg(@RequestParam(value="UserId",required = true) String cnUserId){
		return booksel.selnotebook(cnUserId);
	}
	//通过笔记本ID查询笔记信息
	@RequestMapping(value="/NoteMsg",method = RequestMethod.POST)
	@ResponseBody
	public  returngeneral<List<CnNote>> GetNoteMsg(@RequestParam(value="notebookid",required = true) String notebookid) {
		return booksel.selnote(notebookid);
	}
}
