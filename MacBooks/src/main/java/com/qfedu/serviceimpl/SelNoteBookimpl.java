package com.qfedu.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qfedu.enums.stats;
import com.qfedu.pojos.CnNote;
import com.qfedu.service.SelNoteBook;
import com.qfedu.utli.returngeneral;
import com.qfedu.vo.daos.CnUserBookNote;
@Service
public class SelNoteBookimpl implements SelNoteBook {
	//通过userid查询笔记本id
	//处理笔记本与笔记的dao层
	@Resource
	private CnUserBookNote cnnotedao;
	@Override
	public returngeneral<List<CnNote>> selnotebook(String UserId) {
		//用来返回的扩展类
		returngeneral<List<CnNote>> res = new returngeneral<>();
		
		List<CnNote> list = cnnotedao.getNoteBookdao(UserId);
		res.setData(list);
		res.setMsg("查询出以下笔记");
		res.setStat(stats.succeed);
		return res;
	}
	//------------------
	//通过笔记本id查询笔记
	@Override
	public returngeneral<List<CnNote>> selnote(String cnNotebookId) {
		//用来返回的扩展类
		returngeneral<List<CnNote>> res = new returngeneral<>();
		//返回的参数
		List<CnNote> list = cnnotedao.selnote(cnNotebookId);
		//扩展返回
		res.setData(list);
		res.setMsg("查询出以下笔记");
		res.setStat(stats.succeed);
		return res;
	}

}
