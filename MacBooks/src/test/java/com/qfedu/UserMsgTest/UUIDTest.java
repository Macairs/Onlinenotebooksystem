package com.qfedu.UserMsgTest;

import com.qfedu.utli.UserIdUUID;

public class UUIDTest {
	public static void main(String []args) {
		String uuid = UserIdUUID.CreateUUID();
		System.out.println(uuid);
	}
}
