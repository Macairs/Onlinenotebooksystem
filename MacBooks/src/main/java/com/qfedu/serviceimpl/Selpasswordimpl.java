package com.qfedu.serviceimpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qfedu.daos.CnUserMapper;
import com.qfedu.dto.QueryExpansion;
import com.qfedu.enums.stats;
import com.qfedu.pojos.CnUser;
import com.qfedu.service.selUserPassword;
import com.qfedu.utli.UserMessageMd5;
@Service
public class Selpasswordimpl implements selUserPassword {
	//因为之前已经注入过一次了 所以这次注入的话要自定名称
	@Resource(name="cnUserMapper")
	private CnUserMapper cnmsg ;
	@Override
	public QueryExpansion Selectpassword(String password,String UserId,String coppassword) {
		//旧密码加密后的密码
		StringBuffer md5password = UserMessageMd5.UserMd5(password);
		String pas = md5password.toString();
		//新密码加密
		StringBuffer newpass = UserMessageMd5.UserMd5(coppassword);
		String newpassword = newpass.toString();
		//扩展处理类
		QueryExpansion querys = new QueryExpansion();
		//查询出来的user信息
		CnUser iuser = cnmsg.selectByPrimaryKey(UserId);
		//标识符
		boolean ok = true;
		if(iuser.getCnUserPassword()==null) {
			querys.setStat(stats.undata);
			querys.setMsg("查询不到值");
			querys.setPassword(null);
			ok=false;
		}else {
			if(iuser.getCnUserPassword().equals(pas)) {
				int count = pudpassword(newpassword,UserId);
				//判断是否修改成功
				if(count>0) {
					querys.setStat(stats.succeed);
					querys.setMsg("修改成功");
				}else {
					querys.setStat(stats.Default);//这个地方有冲突 需要修改
					querys.setMsg("修改失败,数据访问出错");
				}
			}else {
				querys.setStat(stats.fail);
				querys.setMsg("原密码有误");
			}
		}
		
		
		return querys;
	}
	
	
	
	
	//更新修改后的密码
	@Override
	public int pudpassword(String coppassword,String cnUserId) {
		CnUser cnuserid = new CnUser();
		cnuserid.setCnUserId(cnUserId);
		cnuserid.setCnUserName(null);
		cnuserid.setCnUserNick(null);
		cnuserid.setCnUserPassword(coppassword);
		cnuserid.setCnUserToken(null);
		int count = cnmsg.updateByPrimaryKeySelective(cnuserid);
		return count;
	}

}
