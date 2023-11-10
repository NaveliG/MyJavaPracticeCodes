package com.oop.java;

public class ReverseString {

	public static String revString(String str) {
//		StringBuilder sb = new StringBuilder(str);
//		sb.reverse();
//		return sb.toString();
		
		//2nd way by using reverse iteration
		char ch[]=str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev+=ch[i];
		}
		return rev;
		
		
		
	}
	public static void main(String[] args) {
		System.out.println(revString("The day is good"));
		System.out.println(revString("I am awesome"));
		
	}
}
