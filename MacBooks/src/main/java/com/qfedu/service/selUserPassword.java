package com.qfedu.service;

import com.qfedu.dto.QueryExpansion;

public interface selUserPassword {
		public QueryExpansion Selectpassword(String password,String UserId,String coppassword);
		public int pudpassword(String coppassword,String UserId);
}
