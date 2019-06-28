package com.qfedu.aop;

import java.sql.Connection;
import java.sql.DriverManager;

//创建连接数据库的工厂类
public abstract class ConnectMysqlFactory {
	static Connection conn = null;
	public static Connection getconnectfactory() {
			//C3P0驱动器
			String driverClassName = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/cloud_note?useUnicode=true&characterEncoding=utf8";
			String username = "root";
			String password = "12345678";
			try {
				//通过反射获取sql驱动器
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		return conn;
	}
}
