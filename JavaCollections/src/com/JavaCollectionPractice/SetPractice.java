package com.JavaCollectionPractice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		Set<Integer> sc = new HashSet<>();
		
		sc.add(7);
		sc.add(9);
		sc.add(10);
		sc.add(null);
		sc.add(10);
		
		System.out.println(sc);

	}

}
