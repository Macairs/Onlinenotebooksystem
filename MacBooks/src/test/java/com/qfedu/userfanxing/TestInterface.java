package com.qfedu.userfanxing;

import com.qfedu.interfacecallback.DataMsgcallback;

public class TestInterface {
	private DataMsgcallback<String> d  ;
	
	public TestInterface(DataMsgcallback<String> d) {
		this.d = d;
		d.GetData("测试");
	}
}
