package com.array.codes;

public class MethosReturnArray {

	public static void main(String[] args) {
		int a[]=numbers();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] + " ");
		}
	}
		
		public static int[] numbers() {
			int[] arr= {5,6,7,3};
			return arr;
		}
	
}
