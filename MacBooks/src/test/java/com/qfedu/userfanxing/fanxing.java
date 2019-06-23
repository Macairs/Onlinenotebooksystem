package com.qfedu.userfanxing;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import org.junit.Test;

import com.qfedu.interfacecallback.DataMsgcallback;
import com.qfedu.utli.returngeneral;

public class fanxing implements DataMsgcallback<String>{
	private String name;
	@Test
	public void test() {
		
		  returngeneral<String> name = new returngeneral<>();
		  Date nowTime = new Date(System.currentTimeMillis());
		  SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd");
		  String retStrFormatNowDate = sdFormatter.format(nowTime);
//		  System.out.println(nowTime);
		  //随机数
		  Random random = new Random();
		  ArrayList<Integer> listrandom = new ArrayList<>();
		  listrandom.add(random.nextInt(6));
		 System.out.println(listrandom.toString()); 
		  
		  
	}
	

	
	public String getname() {
		return name;
	}



	@Override
	public void GetData(String DataMsg) {
		this.name = DataMsg;
	}



}
