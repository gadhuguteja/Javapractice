package com.collection.assignment;

import java.util.*;

public class HighestDuplicateNumber {

	public static void main(String[] args) {
		int max1 = Integer.MIN_VALUE;

		/*
		 * List<Integer> ll = Arrays.asList(num);
		 * 
		 * for(int i=0; i<ll.size(); i++) { for(int j=i+1; j<ll.size(); j++) {
		 * if(ll.get(i).equals(ll.get(j))) { max1 = Math.max(max1,ll.get(j)); break; } }
		 * } System.out.println(max1);
		 */
		List<Integer> ll = new ArrayList<>();
		ll.add(4);
		ll.add(9);
		ll.add(4);
		ll.add(8);
		ll.add(9);

		/* System.out.println(ll); */

		for (int i = 0; i < ll.size(); i++) {
			for (int j = i + 1; j < ll.size(); j++) {
				if (ll.get(i).equals(ll.get(j))) {
					List<Integer> newLlist = new ArrayList<>();
					newLlist.add(ll.get(j));
					/* System.out.println(newLlist); */
					System.out.println(ll.get(j)); 
				}
				
			}

		}

	}

}
