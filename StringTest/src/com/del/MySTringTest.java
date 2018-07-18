package com.del;

public class MySTringTest {

	public MySTringTest() {
		String str = "Hello";
		System.out.println("Str is: " + str);
		modify(str);// String is immutable, it is a constant
		System.out.println("After Modify str:" + str);
		StringBuilder sb = new StringBuilder("Hello");
		modify(sb);
		System.out.println("sb: " + sb);
	}

	private void modify(StringBuilder sb) {
		sb.append(" guys");

	}

	private void modify(String str) {
		str = str.concat(" guys");// creates a new string object
		System.out.println("Here Str: " + str);

	}

	public static void main(String[] args) {

		new MySTringTest();

	}

}
