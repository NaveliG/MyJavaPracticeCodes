package com.star.pattern;

public class Pattern14 {

	public static void main(String[] args) {
		int size=6;
		for(int row=1;row<size;row++) {
			for(int sp=1;sp<size-row;sp++) {
				System.out.print(" ");
			}
			for(int st=1;st<2*row;st++) {
				if(st==1 | st==2*row-1 || row==size-1) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
