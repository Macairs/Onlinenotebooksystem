package com.qfedu.service;

import java.util.List;

import com.qfedu.pojos.CnNote;
import com.qfedu.utli.returngeneral;

public interface PseudoDel {
	//回收站查询
	public returngeneral<List<CnNote>> PseudoDelNote(String UserId);
	//删除操作
	public Integer DelNote(String Noteid);
}
