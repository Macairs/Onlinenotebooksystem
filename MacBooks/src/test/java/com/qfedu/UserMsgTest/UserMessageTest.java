package com.qfedu.UserMsgTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qfedu.daos.CnUserMapper;
import com.qfedu.pojos.CnUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-service.xml","classpath:spring/spring-dao.xml"})
public class UserMessageTest {
	@Autowired
	private CnUserMapper cn;
	@Test
	public void ServiceTest() {
		List<CnUser> list = cn.selectByExample(null);
		for(CnUser cns :list) {
			System.out.println(cns.getCnUserPassword());
		}
	}
}
