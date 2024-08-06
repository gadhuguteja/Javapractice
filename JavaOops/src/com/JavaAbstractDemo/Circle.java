package com.JavaAbstractDemo;

public class Circle extends MyAbClass {
	
	private double radius;
    
    public Circle(double r) { 
       this.radius = r; 
    } 
    public boolean draw() { 
       System.out.println("Drawing Circle"); 
	return false;
    } 
    public double getArea() { 
       return Math.PI*radius*radius;
    }
    
   

}
