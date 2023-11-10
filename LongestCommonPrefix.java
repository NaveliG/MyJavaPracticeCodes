package com.string.codes;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		 String[] arr = {"mint", "mini", "mineral"};
		 int size=arr.length;
		 if(size==0) {
			 System.out.println("Longest common prefix :");
		 }
		 else if(size==1) {
			 System.out.println("Longest common prefix is :" +arr[0]);
		 }
		 else {
			 //sort the array
			 Arrays.sort(arr);
			 int len=arr[0].length();
			 StringBuilder sb = new StringBuilder();
			 for(int i=0;i<len;i++) {
				 if(arr[0].charAt(i)==arr[size-1].charAt(i)) {
					 sb.append(arr[0].charAt(i));
				 }
			 }
			 String result=sb.toString();
			 System.out.println("Longest common prefix is :" +result);
		 }
	}
}
