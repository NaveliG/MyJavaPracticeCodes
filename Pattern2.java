package com.star.pattern;

public class Pattern2 {
	static int size=5;
	public static void main(String[] args) {
		for(int row=1;row<size;row++) {
			for(int col=1;col<size;col++) {
				if(row==1 | row==size-1 || col==1 || col==size-1) {
					System.out.print(" * ");
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
