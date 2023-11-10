package com.oop.java;

import java.util.Arrays;

public class AnagramsString {

	public static void isAnagrams(String s1,String s2){
		String str1=s1.replaceAll("\\s", "");
		String str2=s1.replaceAll("\\s", "");
		boolean status=true;
		if(str1.length()!=str2.length()) {
			status=false;
		}
		else {
			char[] ArrayS1=str1.toLowerCase().toCharArray();
			char[] ArrayS2=str2.toLowerCase().toCharArray();
			Arrays.sort(ArrayS1);
			Arrays.sort(ArrayS2);
			status=Arrays.equals(ArrayS1, ArrayS2);
		}
		
		if(status) {
			System.out.println(str1 +" and "+ str2 +" are anagrams");
		}else {
			System.out.println(str1 +" and "+ str1 +" are not anagrams");
		}
	}
	
	public static void main(String[] args) {
		isAnagrams("Keesp", "Peek");
		isAnagrams("coon", "noo");
	}
}
