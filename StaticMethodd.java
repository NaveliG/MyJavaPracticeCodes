package com.oop.java;

public class StaticMethodd {

	int rollno;
	String name;
	static String college="BVCOEW";
	
	//static method to change the value of static variable
	static void college() {
		college="VP";
	}
	
	public StaticMethodd(int r,String n) {
		rollno=r;
		name=n;
		
	}
	
	void display() {
		System.out.println(rollno +" "+name+" " +college);
	}
	public static void main(String[] args) {
		StaticMethodd.college();
		StaticMethodd obj=new StaticMethodd(1, "SVPM");
		StaticMethodd obj1=new StaticMethodd(2, "SCEMS");
		obj.display();
		obj1.display();
	}
}
