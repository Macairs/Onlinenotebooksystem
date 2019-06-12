package com.qfedu.UserMsgTest;

import com.qfedu.utli.UserMessageMd5;

public class Md5Test {
	public static void main(String []args) {
		StringBuffer d = UserMessageMd5.UserMd5("123456");
		  System.out.println(d);
		
	}
}
