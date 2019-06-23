package com.qfedu.utli;

import java.util.LinkedHashMap;
import java.util.Map;

public class BuffCache {
	private Map<String,Object> data = null ;
	public  Map<String,Object> retBuffer() {
			if(data==null) {
				data = new LinkedHashMap<String,Object>();
			}else {
				return data;
			}
		return data;
	}
	
}
