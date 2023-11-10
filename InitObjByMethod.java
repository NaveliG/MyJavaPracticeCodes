package com.oop.java;

public class InitObjByMethod {

	int id;
	String name;
	
	void insert(int I,String N) {
		id=I;
		name=N;
	}
	
	void displayVal() {
		System.out.println(id+" "+name);
	}
}
	
class TestStud{
		public static void main(String[] args) {
			InitObjByMethod obj=new InitObjByMethod();
			obj.insert(12, "Gholap");
			obj.insert(13, "Swarali");
		}
	}


