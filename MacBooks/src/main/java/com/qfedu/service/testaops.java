package com.qfedu.service;

import com.qfedu.pojos.CnNote;
import com.qfedu.pojos.CnNoteActivity;

public interface testaops {
	//获取AOP切面取到的值，直接用来保存
	public CnNote testselect();
	//通过noteid查询活动列表中的值
	public CnNoteActivity getactivity(String noteid);
}
