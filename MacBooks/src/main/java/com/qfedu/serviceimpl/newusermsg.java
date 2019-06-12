package com.qfedu.serviceimpl;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.qfedu.enums.stats;
import com.qfedu.pojos.CnUser;
import com.qfedu.service.usermsg;
import com.qfedu.utli.UserIdUUID;
import com.qfedu.utli.UserMessageMd5;
import com.qfedu.utli.returngeneral;
import com.qfedu.vo.daos.CnUserName;
@Service
public class newusermsg implements usermsg {
	//注入user信息的dao层
	@Resource
	private CnUserName cnuser;
	@Override
	public returngeneral<CnUser> list(String name,String password) {
		//泛型是用来接收扩展后的值，发送给前端使用
		returngeneral<CnUser> username = new returngeneral<>();
		//dao层
			CnUser usermsg = cnuser.GetUserName(name);
			//MD5加密
			//这个获得的是buff对象要toString才是string
			StringBuffer pass = UserMessageMd5.UserMd5(password);
			if(usermsg !=null) {
					if(usermsg.getCnUserPassword().equals(pass.toString())) {
						username.setStat(stats.succeed);
						username.setMsg("登录成功！");
						username.setData(usermsg);
					}else {
						username.setStat(stats.fail);
						username.setMsg("登录失败！");
						username.setData(usermsg);
						
					}
			}else {
				username.setData(usermsg);
				username.setStat(stats.undata);
				username.setMsg("用户名不存在，请检查用户名是否输入有误");
			}
		return username;
	}
	//以下是注册操作
	@Override
	public returngeneral<CnUser> create(String name, String password, String nickname) {
		//创建返回对象
		returngeneral<CnUser> r = new returngeneral<>();
		//查询操作
		CnUser usermsg = cnuser.GetUserName(name);
		if(usermsg==null) {
			//密码加密
			StringBuffer Md5password = UserMessageMd5.UserMd5(password);
			//创建对象并且将值保存到对象中
			CnUser cnusermsg = new CnUser();
			cnusermsg.setCnUserName(name);
			cnusermsg.setCnUserPassword(Md5password.toString());
			cnusermsg.setCnUserNick(nickname);
			cnusermsg.setCnUserToken(null);//权限设置（暂未设置）
			cnusermsg.setCnUserId(UserIdUUID.CreateUUID());
			//添加用户操作
			int count = cnuser.insert(cnusermsg);
			r.setStat(stats.succeed);
			r.setMsg("注册成功");
		}else {
			r.setData(usermsg);
			r.setMsg("此用户已存在");
			r.setStat(stats.fail);
		}
		
		return r;
	}

}
