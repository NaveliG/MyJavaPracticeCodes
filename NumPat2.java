package com.star.pattern;

public class NumPat2 {

	public static void main(String[] args) {
		for(int row=0;row<=6;row++) {
			for(int col=0;col<=5-row;col++) {
				System.out.print(" ");
			}
			for(int num=1;num<=row;num++) {
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
