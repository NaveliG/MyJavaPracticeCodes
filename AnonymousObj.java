package com.oop.java;

public class AnonymousObj {

	void fact(int n) {
		int fact = 1;
		for (int i = 1; i < n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of number is :" + fact);
	}

	public static void main(String[] args) {
		new AnonymousObj().fact(5);
	}
}
