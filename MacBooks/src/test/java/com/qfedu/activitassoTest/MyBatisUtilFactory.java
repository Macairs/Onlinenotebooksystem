package com.qfedu.activitassoTest;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public abstract class MyBatisUtilFactory {
	private static SqlSessionFactory sessionfactory = null;
	public static SqlSession  getsessionfactory() throws IOException {
		if(sessionfactory==null) {
			InputStream in = Resources.getResourceAsStream("spring/spring-dao.xml");
			sessionfactory = new SqlSessionFactoryBuilder().build(in);
		}
		return sessionfactory.openSession();
	}
}
