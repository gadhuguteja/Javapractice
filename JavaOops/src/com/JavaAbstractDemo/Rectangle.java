package com.JavaAbstractDemo;

public class Rectangle extends MyAbClass{
	
	private double length;
    private double width;
     
    public Rectangle(double length, double width) { 
       this.length = length; 
       this.width = width; 
    } 
    public boolean draw() { 
       System.out.println("Drawing Rectangle");
	return false; 
    } 
    public double getArea() { 
       return length*width; 
    } 

}
