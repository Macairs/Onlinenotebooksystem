package com.qfedu.serviceimpl;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qfedu.daos.CnNoteMapper;
import com.qfedu.daos.CnNotebookMapper;
import com.qfedu.pojos.CnNote;
import com.qfedu.pojos.CnNotebook;
import com.qfedu.service.CreateNoteBook;
import com.qfedu.utli.SystemData;
import com.qfedu.utli.UserIdUUID;

@Service
public class CreatenoteBookimpl implements CreateNoteBook {
	//添加笔记本操作
	@Resource(name="cnNotebookMapper")
	private CnNotebookMapper notebookdao;
	//添加笔记的DAO
	@Resource(name="cnNoteMapper")
	private CnNoteMapper createnote;
	@Override
	public int CreateNotebook(String NoteBookName, String UserId) {
		//笔记本对象
		CnNotebook notebook = new CnNotebook();
		notebook.setCnNotebookCreatetime(SystemData.Systemdata());
		notebook.setCnNotebookDesc(null);
		notebook.setCnNotebookId(UserIdUUID.CreateUUID());
		notebook.setCnNotebookName(NoteBookName);
		//自定义随机数
		Random random = new Random(6);
		byte []b = {(byte) random.nextInt(6)};
		//-----
		notebook.setCnNotebookTypeId(Arrays.toString(b));
		notebook.setCnUserId(UserId);
		int count  = notebookdao.insertSelective(notebook);
		System.out.println(count);
		return count;
	}
	//添加笔记
	@Override
	public int CreateNote(String notebookid, String notename,String userid) {
		CnNote note = new CnNote();
		note.setCnNotebookId(notebookid);
		note.setCnNoteTitle(notename);
		note.setCnNoteId(UserIdUUID.CreateUUID());
		note.setCnUserId(userid);
		note.setCnNoteStatusId("1");
		int count = createnote.insertSelective(note);
		return count;
	}

}
