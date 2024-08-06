package com.collection.assignment;

import java.util.*;

public class RemoveDuplicates {

	
	
	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> List){
		
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for(int element : List) {
			if(!newList.contains(element))
			newList.add(element);
		}
		
		return newList;
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer>
        list = new ArrayList<>(
            Arrays
                .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		
		System.out.println("ArrayList with duplicates:" +list);
		
		ArrayList<Integer> newList = removeDuplicates(list);
		System.out.println("ArrayList with out Duplicates:" +newList);
	
	}

}
