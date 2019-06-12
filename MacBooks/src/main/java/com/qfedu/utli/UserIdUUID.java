package com.qfedu.utli;

import java.util.UUID;
public class UserIdUUID {	
		public static String CreateUUID() {
			String uuid = UUID.randomUUID().toString();
			return uuid;
		}
}
