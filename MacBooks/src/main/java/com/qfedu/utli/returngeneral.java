package com.qfedu.utli;

import com.qfedu.enums.stats;

public class returngeneral<T> {
	private T data ;
	private  stats  stat;//这个是枚举 enum
	private String msg;
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
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
	@Override
	public String toString() {
		return "returngeneral [data=" + data + ", stat=" + stat + ", msg=" + msg + "]";
	}
	
}
