package com.JavaPolymorphismDemo;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ICollege clg = new Student();
		System.out.println(clg.getBranch());
		
		int arr[]  =  {3,5,4,6,7,8,9};
		int x=0;
		int y=0;
		
		System.out.println((x < y) ? -1 : ((x == y) ? 0 : 1));
		

	}

}
