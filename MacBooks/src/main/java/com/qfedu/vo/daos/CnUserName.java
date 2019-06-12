package com.qfedu.vo.daos;

import com.qfedu.daos.CnUserMapper;
import com.qfedu.pojos.CnUser;

public interface CnUserName extends CnUserMapper {
	public CnUser GetUserName(String name);
}
