package com.collection.assignment;

import java.util.HashMap;
import java.util.Map;

public class RunnerClass {
	
	public static void main(String args[]) {
		
		HashMap<Integer, Student> rc = new HashMap<>();
		
		Student s1 = new Student("Gadugu", "Surya");
		Student s2 = new Student("maddelaa", "Chinnu");
		Student s3 = new Student("Rayasam", "harsh");
		Student s4 = new Student("Gurram", "Reddy");
		
		rc.put(101, s1);
		rc.put(102, s2);
		rc.put(103, s3);
		rc.put(104, s4);
		
		for(Map.Entry m : rc.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue().toString());
		}
		
		
		
		
	}

}
