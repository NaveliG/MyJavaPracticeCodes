package com.array.codes;

import java.util.Scanner;

public class ArrayInput {
	static int n;
	public static void main(String[] args) {
		System.out.println("Enter the element you want to store :");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		int arr[] = new int[10];
		System.out.println("Enter the element of array :");
		for(int i=0;i<n;i++) {
			//reading the elements from user
			arr[i]=sc.nextInt();
			
		}
		System.out.println("Elements of array are :");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
