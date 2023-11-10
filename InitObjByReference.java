package com.oop.java;

public class InitObjByReference {

	int id;
	String name;
	
	public static void main(String[] args) {
		InitObjByReference obj=new InitObjByReference();
		//using reference here using dot operator
		obj.id=1;
		obj.name="Naveli";
		System.out.println(obj.id+" "+obj.name);
	}
}
