package com.star.pattern;

public class NumPattern {

	public static void main(String[] args) {
		int size=6;
		for(int row=0;row<size;row++) {
			for(int col=0;col<row;col++) {
				
				System.out.print(" ");
			}
			
			for(int num=0;num<2*(size-row)-1;num++) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
