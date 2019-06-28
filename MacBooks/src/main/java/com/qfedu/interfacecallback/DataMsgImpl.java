package com.qfedu.interfacecallback;

public class DataMsgImpl {
	//定义接口
	private DataMsgcallback<String> msg;
	public DataMsgImpl(DataMsgcallback<String> msg) {
		this.msg = msg;
	}
	//------传值
	public void setData(String noteid) {
		msg.GetData(noteid);
	}
}
