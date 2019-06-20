package com.qfedu.vo.daos;

import java.util.List;

import com.qfedu.daos.CnNoteMapper;
import com.qfedu.pojos.CnNote;
import com.qfedu.utli.returngeneral;

public interface CnUserBookNote extends CnNoteMapper {
	public List<CnNote> getNoteBookdao(String cnUserId);
	public List<CnNote> selnote(String cnNotebookId);
	//通过笔记id查询笔记标题
	public CnNote getNote(String CnNoteId);
	//通过用户id查询状态值为0的笔记
	public List<CnNote> getstatNote0(String CnUserid);
}
