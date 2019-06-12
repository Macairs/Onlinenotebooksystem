package com.qfedu.service;
import com.qfedu.enums.stats;
import com.qfedu.pojos.CnUser;
import com.qfedu.utli.returngeneral;
public interface usermsg {
	//登录操作
	public returngeneral<CnUser> list(String name,String password);
	//注册操作
	public returngeneral<CnUser> create(String name,String password,String nickname);
}
