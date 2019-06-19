package com.qfedu.serviceimpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qfedu.daos.CnNoteMapper;
import com.qfedu.enums.stats;
import com.qfedu.pojos.CnNote;
import com.qfedu.service.PseudoDel;
import com.qfedu.utli.returngeneral;
import com.qfedu.vo.daos.CnUserBookNote;
//回收站操作
@Service
public class PseudoDelImpl implements PseudoDel {
	@Resource(name="cnUserBookNote")
	private CnUserBookNote PseudoNote;
	@Override
	public returngeneral<List<CnNote>> PseudoDelNote(String UserId) {
		returngeneral<List<CnNote>> returngeneral = new returngeneral<List<CnNote>>();
		List<CnNote> note = PseudoNote.getstatNote0(UserId);
		returngeneral.setData(note);
		returngeneral.setMsg("查询成功");
		returngeneral.setStat(stats.succeed);
		return returngeneral;
	}
	
	//删除操作
	@Resource(name="cnNoteMapper")
	private CnNoteMapper notemapper;
	@Override
	public Integer DelNote(String Noteid) {
		Integer count = notemapper.deleteByPrimaryKey(Noteid);
		return count;
	}
	

}
