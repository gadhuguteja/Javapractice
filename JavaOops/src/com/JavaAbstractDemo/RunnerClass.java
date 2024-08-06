package com.JavaAbstractDemo;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IShape cr = new Circle(2.1);
		IShape rec = new Rectangle(2,5);
		System.out.println(rec.getArea());
		System.out.println(cr.draw());

	}

}
