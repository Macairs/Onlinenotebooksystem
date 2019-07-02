package com.qfedu.serviceimpl;

import javax.annotation.Resource;

//import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qfedu.daos.CnNoteActivityMapper;
import com.qfedu.pojos.CnNote;
import com.qfedu.pojos.CnNoteActivity;
import com.qfedu.service.testaops;
import com.qfedu.utli.DataNoteContext;
import com.qfedu.utli.UserIdUUID;
@Service
public class testaopsimpl implements testaops{
//通过HttpServiceRequest获取储存的值
//	@Autowired
//	private HttpServletRequest request;
	@Autowired
	private DataNoteContext c;
	@Resource(name="cnNoteActivityMapper")
	private CnNoteActivityMapper noteactivi ;
	public testaopsimpl() {}
	@Override
	public CnNote testselect() {
//		System.out.println("调用了service"+request.getAttribute("test"));
		//创建一个CnNoteActivity对象
		CnNoteActivity activity = new CnNoteActivity();
		//将或得到的数据保存到活动列表
		String body = c.getNotedata().getCnNoteBody();
		String activityid = UserIdUUID.CreateUUID();
		String title = c.getNotedata().getCnNoteTitle();
		String noteid =c.getNotedata().getCnNoteId();
		String notebookid = c.getNotedata().getCnNotebookId();
		//将获取到的值绑定给活动对象
		activity.setCnNoteActivityBody(body);
		activity.setCnNoteActivityDown(0);
		activity.setCnNoteActivityId(activityid);
		activity.setCnNoteActivityTitle(title);
		activity.setCnNoteActivityUp(0);
		activity.setCnNoteId(noteid);
		activity.setCnActivityId(notebookid);
		//保存值
		noteactivi.insertSelective(activity);
		return c.getNotedata();
	}
	
	
	//通过笔记id查询活动列表中的笔记相关信息
	@Resource(name="cnNoteActivityMapper")
	private CnNoteActivityMapper activit;
	@Override
	public CnNoteActivity getactivity(String noteid) {
		CnNoteActivity activite = activit.selectByPrimaryKey(noteid);
		return activite;
	}
}
