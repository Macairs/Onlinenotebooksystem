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
}
