package com.java8.practice;

import java.util.*;

public class FPOddNumbers {

	public static void main(String[] args) {

		printOddNumberCubesInList(List.of(2, 3, 5, 4, 7, 4, 11, 19));
		printCoursenameIndividualyFunctional(List.of("Spring", "Spring Boot", "Kotlin", "Go", "Angular"));

	}

	private static void printCoursenameIndividualyFunctional(List<String> course) {
		/*
		 * course.stream().filter(sub ->
		 * sub.contains("Spring")).forEach(System.out::println);
		 * 
		 * course.stream().filter(sub1 -> sub1.length() >=
		 * 4).forEach(System.out::println);
		 */
		course.stream().map(sub->sub +" "+ sub.length()).forEach(System.out::println);
	}

	private static void printOddNumberCubesInList(List<Integer> numbers) {
		//numbers.stream().filter(num -> num % 2 != 0).map(num -> num = num * num * num).forEach(System.out::println);
	}

	/*
	 * private static void printOddNumbersInListFunctional(List<Integer> number) {
	 * 
	 * number.stream().filter(num->num%2 != 0).forEach(System.out::println);
	 * 
	 * 
	 * }
	 */

}
