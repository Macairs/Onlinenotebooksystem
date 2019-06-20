package com.qfedu.utli;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemData {
	public static Date Systemdata() {
		   Date nowTime = new Date(System.currentTimeMillis());
//		   SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd");
//		   String retStrFormatNowDate = sdFormatter.format(nowTime);
		  return nowTime;
	}
}
