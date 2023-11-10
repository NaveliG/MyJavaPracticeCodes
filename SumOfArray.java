package com.array.codes;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the number of elements in array :");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Now enter the elements :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Sum of elements of array is :" );
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			System.out.println(sum);
		}
	}
}
