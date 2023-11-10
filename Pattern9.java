package com.star.pattern;

public class Pattern9 {

	public static void main(String[] args) {
		int size=7;
		for(int row=1;row<=size;row++) {
			for(int sp=1;sp<=row;sp++) {
				System.out.print(" ");
			}
			for(int st=0;st<=size-row;st++) {
				System.out.print("*");
			}
			for(int col=1;col<=size-row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
