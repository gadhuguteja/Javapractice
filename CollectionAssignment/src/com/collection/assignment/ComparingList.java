package com.collection.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<>();
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		list.add(30);
		
		int min = Collections.min(list);
		
		Collections.replaceAll(list, 30, 50);
		System.out.println(list);
		
		int max = Collections.max(list);
		
		if (min == max) {
			System.out.println("All elements are equal");
			
		}else {
			System.out.println("Minimum Value :" + min);
			System.out.println("Maximum value :" + max);
		}

	}

}
