package com.collection.assignment;

import java.util.Collections;
import java.util.Vector;

public class VectorPractice {

	public static void main(String[] args) {
		Vector<Integer> val = new Vector<>();
		val.add(120);
		val.add(225);
		val.add(113);
		val.add(14);
		val.add(53);
		
		//for(int x : val)
		
//		int max = Collections.max(val);
//		System.out.println(max);
		
		Collections.sort(val);
		System.out.println(val);
		
		int index = Collections.binarySearch(val, 225);
		
		System.out.println("value found at index :" + index);
		
		

	}

}
