package com.string.codes;

public class ReverseUsingStringBuilder {

	public static void main(String[] args) {
		String input="Gholap";
		StringBuilder sb = new StringBuilder();
		sb.append(input);
		sb.reverse();
		System.out.println("Reversed string is :" +sb);
	}
}
