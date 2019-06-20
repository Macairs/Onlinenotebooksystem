package com.qfedu.service;
public interface CreateNoteBook {
	//添加笔记本操作
	public int CreateNotebook(String NoteBookName,String UserId);
	//添加笔记操作
	public int CreateNote(String notebookid,String notename,String userid);
}
