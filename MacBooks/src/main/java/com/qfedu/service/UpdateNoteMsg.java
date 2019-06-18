package com.qfedu.service;

public interface UpdateNoteMsg {
	//修改note操作
	public int UpdNote(String id,String Notebody,String NoteTitle);
	//伪删除的修改操作
	public int PseuDodel(String userid);
	
}
