package com.qfedu.userfanxing;

public class DemoTest {
	public static void main(String[]args) {
		fanxing f = new fanxing();
		TestInterface t = new TestInterface(f);
		String name = f.getname();
		System.err.println(name);
	}
}
