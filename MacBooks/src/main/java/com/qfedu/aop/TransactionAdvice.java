package com.qfedu.aop;
import java.sql.SQLException;
import java.util.Map;
import org.aspectj.lang.ProceedingJoinPoint;
import com.qfedu.interfacecallback.DataMsgcallback;
public class TransactionAdvice implements DataMsgcallback<String>{
	private static String msg;
	//前置通知
		public void before() throws SQLException {
			TestConnectMysql mysqlconnection = new TestConnectMysql();
			Map<String,Object> note = mysqlconnection.Crud(msg);
			String noteid = (String)note.get("userid");
			System.out.println("前置通知---"+noteid);
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
		public Object around(ProceedingJoinPoint point) throws Throwable {
			 	Object proceed = point.proceed();
			 	return proceed;
			}
		@Override
		public void GetData(String DataMsg) {
			this.msg = DataMsg;
		}
		
}
