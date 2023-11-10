package com.string.codes;

public class ReverseUsingWhile {

	public static void main(String[] args) {
		String input="Flower";
		int strLength=input.length();
		while(strLength>0) {
			System.out.println(input.charAt(strLength-1));
			strLength--;
		}
	}
}
