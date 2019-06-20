package com.qfedu.dto;

import com.qfedu.enums.stats;

public class QueryExpansion {
	private String password;
	private stats  stat;
	private String msg;
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public stats getStat() {
		return stat;
	}
	public void setStat(stats stat) {
		this.stat = stat;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
