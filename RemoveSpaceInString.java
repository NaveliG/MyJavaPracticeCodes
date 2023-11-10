package com.oop.java;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		//1st way
		String str="India is my country";
		String nospace=str.replaceAll("\\s","");
		System.out.println(nospace);
		
		//2nd way
		char[] strArray=str.toCharArray();
		StringBuffer sbr=new StringBuffer();
		for(int i=0;i<strArray.length;i++) {
			 if ((strArray[i] != ' ') && (strArray[i] != '\t')){
				 sbr.append(strArray[i]);
				
			}
			 
		}
		
		String nospacestr=sbr.toString();
		System.out.println(nospace);
		
	}
}
