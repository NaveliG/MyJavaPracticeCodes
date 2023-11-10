package com.star.pattern;

public class Pattern6 {
	
	public static void main(String[] args) {
		int size=5;
		for(int row=0;row<=size;row++) {
			for(int col=0;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int row=1;row<=size;row++) {
			for(int col=0;col<=size-row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
