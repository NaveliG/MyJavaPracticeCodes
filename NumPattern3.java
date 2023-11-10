package com.star.pattern;

public class NumPattern3 {

	public static void main(String[] args) {
		for(int row=0;row<6;row++) {
			for(int col=0;col<6-row-1;col++) {
				System.out.print(" ");
			}
			
			for(int num=0;num<2*row+1;num++) {
				System.out.print(num+1);
			}
			System.out.println();
		}
	}
}
