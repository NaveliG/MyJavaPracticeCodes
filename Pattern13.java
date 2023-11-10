package com.star.pattern;

public class Pattern13 {

	public static void main(String[] args) {
		int size = 5;
		for (int row = 0; row <= size; row++) {
			for (int col = 0; col <= size; col++) {
					if(row+col==size+1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
			}
			System.out.println();
		}
	}
}
