package com.star.pattern;

public class Pattern8 {

	public static void main(String[] args) {
		int size=5;
		for(int row=0;row<size;row++) {
			for(int sp=0;sp<=size-row;sp++) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			for(int col=1;col<row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
