package com.oop.java;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringComparison {

	public static void main(String[] args) {
		String n1="Naveli";
		String n2="GHOLAP";
		int n=Integer.valueOf(n2);
		String n3=new String("Naveli");
		String a1="beauty";
		String a2=new String("beauty");
		System.out.println(n1.equals(n2));
		System.out.println(n1.equals(n3));
		System.out.println(n1.equalsIgnoreCase(n2));
		System.out.println("This will check references" +n1==n2);
		
		//System.out.println(n);
		System.out.println(n2);
		StringJoiner s = new StringJoiner(",");
		s.add("I am Awesome");
		s.add("yes you are awesome");
		System.out.println(s.toString());
		
		
		List<String> liststr=Arrays.asList("abs","efg","hij");
		String str = liststr.stream().collect(Collectors.joining());
		System.out.println(str.toString());
		String text=new String("HII , I AM NAVELI");
		String[] sen=text.split("\\.");
		System.out.println(Arrays.toString(sen));
		
	}
}
