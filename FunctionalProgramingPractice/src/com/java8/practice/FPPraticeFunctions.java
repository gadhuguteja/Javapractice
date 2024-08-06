package com.java8.practice;

import java.util.List;
import java.util.function.BinaryOperator;

public class FPPraticeFunctions {

	public static void main(String[] args) {
		
		System.out.println(printSummOfAllNumberInList(List.of(2,3,4,5)));

	}

	private static int printSummOfAllNumberInList(List<Integer> sum) {
		
		BinaryOperator<Integer> sumaccumulator = Integer::sum;
		
		BinaryOperator<Integer> sumaccumulator2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
			
		};
		
		return sum.stream().reduce(0, sumaccumulator2);
	}

}
