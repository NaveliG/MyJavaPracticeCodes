package com.array.codes;

import java.util.Arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		int c[]=new int[a.length];
		
		//check the length
		if(a.length==b.length) {
			for(int i=0,j=0,k=0;i<a.length;i++,j++,k++) {
				c[k]=a[i]+b[j];
			}
			System.out.println("Resultant array is");
			System.out.println(Arrays.toString(c));
		}else
		{
			System.out.println("Length of both array should be same ");
		}
	}
}
