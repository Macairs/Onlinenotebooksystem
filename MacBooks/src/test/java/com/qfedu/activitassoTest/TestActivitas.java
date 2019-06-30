package com.qfedu.activitassoTest;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qfedu.pojos.CnNoteActivity;
import com.qfedu.pojos.vo.CnNoteVo;
import com.qfedu.vo.daos.CnNoteAritileVo;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class TestActivitas {
		@Autowired
		private CnNoteAritileVo vo;
		//不需要扩展查询
		@Test
		public void testGetdata() {
			List<CnNoteVo> g = vo.Getdatavo("48595f52-b22c-4485-9244-f4004255b972");
			for(int i = 0 ;i<g.size() ;i++ ) {
				System.out.println(g.get(i).getActivitys().getCnNoteActivityBody());
			}
		}
		
		
//		//查询结果
//		@Test
//		public void testSelectaritile() {
//			List<CnNoteVo> d  = vo.Getdatavo("48595f52-b22c-4485-9244-f4004255b972");
//			for(int i = 0 ;i<d.size() ;i++) {
//				CnNoteVo df  =  d.get(i);
//				System.out.println(df.getActivitys().getCnNoteId());
//			}
//		}
//		@Test
//		public void testSelectActivit() {
//			List<CnNoteVo> d  = vo.Getdatavo("409c64da-fd02-448e-b4ec-8dc0cc029922");
//			for(CnNoteVo x: d) {
//				System.out.println(x.getCnNoteBody());
//				System.out.println(x.getCnNoteTitle());
//				System.out.println(x.getCnUserId());
//			}
//		}
}
