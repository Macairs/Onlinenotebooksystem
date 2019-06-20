package com.qfedu.utli;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class UserMessageMd5 {
			public static StringBuffer UserMd5(String password) {
				StringBuffer sb = null ;
				 // 需要加密的字符串password
		       
		        try {
		            // 加密对象，指定加密方式
		            MessageDigest md5 = MessageDigest.getInstance("md5");
		            // 准备要加密的数据
		            byte[] b = password.getBytes();
		            // 加密
		            byte[] digest = md5.digest(b);
		            // 十六进制的字符
		            char[] chars = new char[] { '0', '1', '2', '3', '4', '5',
		                 '6', '7' , '8', '9', 'A', 'B', 'C', 'D', 'E','F' };
		            	sb = new StringBuffer();
		            // 处理成十六进制的字符串(通常)
		            for (byte bb : digest) {
		                sb.append(chars[(bb >> 4) & 15]);
		                sb.append(chars[bb & 15]);
		            }
		        } catch (NoSuchAlgorithmException e) {
		            e.printStackTrace();
		        }
		    
				return sb;
			}
}
