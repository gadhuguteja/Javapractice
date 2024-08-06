package com.JavaAbstractDemo;

public interface IShape {
	
	public boolean draw();
	public double getArea();
	
	public default void getLength() {
		System.out.println("getting length");
		
	}

}
