package com.qfedu.Bufftest;

import java.sql.SQLException;
import java.util.Map;

import org.junit.Test;

import com.qfedu.aop.TestConnectMysql;

public class BuffTest {
	@Test
	public void Buff() throws SQLException {
		TestConnectMysql t =new TestConnectMysql();
		Map<String,Object> d = (Map<String, Object>) t.Crud("046b0110-67f9-48c3-bef3-b0b23bda9d4e");
		System.out.println(d.get("userid"));
	}
}
