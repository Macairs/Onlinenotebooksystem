package com.qfedu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qfedu.enums.stats;
import com.qfedu.pojos.CnNote;
import com.qfedu.pojos.CnNoteActivity;
import com.qfedu.service.SelNoteBook;
import com.qfedu.service.testaops;
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
	//通过笔记Id 实现笔记的CURD
	@RequestMapping(value="/NoteCrud",method = RequestMethod.POST)
	@ResponseBody
	public returngeneral<CnNote>  NoteCrud(@RequestParam(value="noteid",required = true)String noteid){
		returngeneral<CnNote> notemsg = booksel.getNote(noteid);
		return notemsg;
	}
	
	
	//通过笔记ID查询活动列表中的笔记
	@Resource(name="testaopsimpl")
	private testaops tes;
	@RequestMapping(value="/getactivit")
	@ResponseBody
	public returngeneral<CnNoteActivity> getactivit(@RequestParam(value="noteid",required = true) String noteid) {
		//扩展类
		returngeneral<CnNoteActivity> r  = new returngeneral<>();
		CnNoteActivity activit = tes.getactivity(noteid);
		if(activit!=null) {
			r.setMsg("查询成功");
			r.setData(activit);
			r.setStat(stats.succeed);
		}else {
			r.setMsg("查询失败");
			r.setStat(stats.undata);
		}
		return r;
	}
}
