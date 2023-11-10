package com.star.pattern;

public class Pattern10 {
	public static void main(String[] args) {
		int size=7;
		for(int row=0;row<size;row++) {
			for(int sp=0;sp<=size-row-1;sp++) {
				System.out.print(" ");
			}
			for(int st=0;st<2*row+1;st++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
