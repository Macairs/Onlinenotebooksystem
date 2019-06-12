package com.qfedu.service;

import java.util.List;

import com.qfedu.pojos.CnNote;
import com.qfedu.utli.returngeneral;

public interface SelNoteBook {
	public returngeneral<List<CnNote>> selnotebook(String cnUserId);
	
	public returngeneral<List<CnNote>> selnote(String cnNotebookId);
	//通过笔记Id查询笔记标题
	public returngeneral<CnNote> getNote(String NoteId);
}
