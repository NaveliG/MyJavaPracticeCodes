package com.star.pattern;

public class Pattern3 {

	public static void main(String[] args) {
		int size=5;
		for(int row=1;row<size+1;row++) {
			for(int col=1;col<size+1;col++) {
				if(row==col || col+row==size+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}
	}
}
