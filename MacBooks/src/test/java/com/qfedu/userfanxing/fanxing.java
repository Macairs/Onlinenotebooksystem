package com.qfedu.userfanxing;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.qfedu.utli.returngeneral;

public class fanxing {
	@Test
	public void test() {
		
		returngeneral<String> name = new returngeneral<>();
		  Date nowTime = new Date(System.currentTimeMillis());
		  SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd");
		  String retStrFormatNowDate = sdFormatter.format(nowTime);
		  System.out.println(retStrFormatNowDate);
	}
}
