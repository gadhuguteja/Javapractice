package com.JavaCollectionPractice;

public class RunnerClassBrackets {
	
	public static void main(String[] args) {
		String expr = ",";
		 
        // Function call
        if (StackBracketsProgram.areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
		

	}

}
