package com.oop.java;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = new StringBuffer("World");
		sb.append("Java");
		sb.insert(1, "Lang");
		sb1.reverse();
		System.out.println(sb);
		System.out.println(sb1);
		
	}
}
