package com.qfedu.aop;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;

import com.qfedu.interfacecallback.DataMsgcallback;
import com.qfedu.pojos.CnNote;
import com.qfedu.utli.DataNoteContext;
public class TransactionAdvice implements DataMsgcallback<String>{
	private static String msg;
	private  CnNote note;
//	@Autowired
//	private HttpServletRequest request;
	@Autowired
	private DataNoteContext c;
	//前置通知
		public void before() throws SQLException, InstantiationException, IllegalAccessException {
			TestConnectMysql mysqlconnection = new TestConnectMysql();
			note = mysqlconnection.Crud(msg);
			c.setNotedata(note);
			System.out.println("前置通知------完成任务");
		}
	//后置通知（出现异常不调用）
		public void afterReturning(){
			
			System.out.println("后置通知-----");
		}
	//后置通知（无论是否出现异常都会执行）
		public void after() {}
	//异常通知	
		public void afterException() {}
	//环绕通知
		/*public Object around(ProceedingJoinPoint point) throws Throwable {
			 	Object proceed = point.proceed();
			 	System.out.println("环绕通知");
			 	return proceed;
			}*/
		//接口回调用来赋值的
		@Override
		public void GetData(String DataMsg) {
			this.msg = DataMsg;
		}
//      可以通过HttpserviceRequest来保存值。
//		public void hello(HttpServletRequest request) {
//			request.setAttribute("test", "测试一下看看情况!希望可以解决传值的问题");	
//		}
		
}
