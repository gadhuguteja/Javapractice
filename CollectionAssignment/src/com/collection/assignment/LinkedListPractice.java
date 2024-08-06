package com.collection.assignment;

import java.util.LinkedList;

public class LinkedListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<>();
		
		LinkedList<String> list1 = new LinkedList<>();
		
		list.add("Gadugu");
		list.add("Surya");
		list.add("Teja");
		list.add("Kesava");
		
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

	}

}
