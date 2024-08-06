package com.collection.assignment;

import java.util.*;

public class ListToArrayCoversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> items = new ArrayList<>();
		
//		items.add("Fridge");
//		items.add("laptop");
//		items.add("AC");
//		items.add("Groceries");
		
		items.add(29);
		items.add(59);
		items.add(27);
		items.add(83);
		
		
		System.out.println("Before converting into Arrays :" +items);
		
		Integer s[] = items.toArray(new Integer[0]);
		
	for(int x : s) {
		System.out.print(x +",");
	}
		
		

	}

}
