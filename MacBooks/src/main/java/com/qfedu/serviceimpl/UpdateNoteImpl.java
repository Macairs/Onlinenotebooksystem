package com.qfedu.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qfedu.daos.CnNoteMapper;
import com.qfedu.pojos.CnNote;
import com.qfedu.service.UpdateNoteMsg;
@Service
public class UpdateNoteImpl implements UpdateNoteMsg {
	@Resource(name="cnNoteMapper")
	private CnNoteMapper NoteDao;
	//note的修改操作
	@Override
	public int UpdNote(String id, String Notebody, String NoteTitle) {
		CnNote note = new CnNote();
		note.setCnNoteBody(Notebody);
		note.setCnNoteCreateTime(System.nanoTime());
		note.setCnNoteId(id);
		note.setCnNoteTitle(NoteTitle);
		NoteDao.updateByPrimaryKey(note);
		return 0;
	}

}
