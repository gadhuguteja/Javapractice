package com.collection.assignment;

import java.util.*;

public class SumAverage {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Integer[] arr = new Integer[] {4,5,0};
		
		
		List<Integer> add1 = new ArrayList<>();
		add1.add(4);
		add1.add(5);
		add1.add(0);
		
		List<Integer> l1 = new ArrayList<>();
		
		l1.add(8);
		l1.add(9);
		l1.add(10);
		
		System.out.println(add1.addAll(l1));
		
		List<Integer> concatinatedList = new ArrayList<>();
		concatinatedList.addAll(add1);
		Collections.sort(concatinatedList);
		System.out.println(concatinatedList);
		
		
		
		//Average of sum numbers
		
		/*System.out.println(add);
		for(int i : add){
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("Average:" + sum/add.size());

	}*/
	
		// sum off even numbers
		/*for(int i : add) {
			if(i%2 == 0)
				sum = sum + i;
		}
		System.out.println(sum);
		
		}*/
		
	
		/*
		 * List<Integer> head = add1.subList(0, 3); List<Integer> tail = add1.subList(3,
		 * 6); System.out.println(head); System.out.println(tail);
		 */
	}

}
