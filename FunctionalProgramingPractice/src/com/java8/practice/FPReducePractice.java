package com.java8.practice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FPReducePractice {

	public static void main(String[] args) {
//		
//		System.out.println(printSqaureOfNumberInList(List.of(2,4,6,7,8,9,3)));
//		System.out.println(printCubeOfNumberInList(List.of(3,2,1)));
//		System.out.println("Sum of Odd Number is:" +printSumOfOddNumberInList(List.of(2,4,6,7,8,9,3)));
		
		//printListOfCoursesAvailable(List.of("Spring","Hibernate","GO Lang","java Script","Microservices"));
		printSortedNumbersInList(List.of(2,4,6,7,8,9,3));
		

	}

	private static void printSortedNumbersInList(List<Integer> odering) {
		
		odering.stream().filter(num1->num1%2!=0).sorted(Comparator.naturalOrder()).forEach(System.out::println);
	}

	private static void printListOfCoursesAvailable(List<String> of) {
		
		of.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
	}

	
	private static int printSumOfOddNumberInList(List<Integer> oddNumbers) { //
	 return
	  oddNumbers.stream().filter(x->x%2!=0).reduce(0,Integer::sum); }

	private static int printCubeOfNumberInList(List<Integer> cubes) {

		return cubes.stream().map(x -> x * x * x).reduce(0, (num1, num2) -> num1 + num2);
	}

	private static int printSqaureOfNumberInList(List<Integer> numbers) {

		return numbers.stream().map(x -> x * x).reduce(0, (num1, num2) -> num1 + num2);
	}

}
