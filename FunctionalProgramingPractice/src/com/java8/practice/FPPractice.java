package com.java8.practice;

import java.util.List;
import java.util.stream.Collectors;

public class FPPractice {

	public static void main(String[] args) {
		
		List<Integer> check = List.of(55,37,98,71,23,49,53);
		
		System.out.println("Second Smallest Number:" + check.stream().distinct().sorted().skip(1).findFirst());
		System.out.println("Second Largest Number:" + check.stream().distinct()
				.sorted((a, b) -> Integer.compare(b,a)).skip(2).findFirst());
		
		//System.out.println("Sorted Number Number:" + check.stream().distinct().sorted().collect(Collectors.toList()));

	}

}
