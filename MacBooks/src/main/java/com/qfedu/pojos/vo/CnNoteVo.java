package com.qfedu.pojos.vo;

import com.qfedu.pojos.CnNote;
import com.qfedu.pojos.CnNoteActivity;

public class CnNoteVo extends CnNote{
	private CnNoteActivity activitys;
	

	public CnNoteVo() {
		super();
	}

	public CnNoteActivity getActivitys() {
		return activitys;
	}

	public void setActivitys(CnNoteActivity activitys) {
		this.activitys = activitys;
	}
	
}