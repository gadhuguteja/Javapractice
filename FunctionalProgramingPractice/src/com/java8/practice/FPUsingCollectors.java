package com.java8.practice;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FPUsingCollectors {

	public static void main(String[] args) {
		//printEvenNumbersInList(List.of(52,61,72,88,93,101,153,188));
		printLengthOfEachCourse(List.of("Spring","Hibernate","GO Lang","java Script","Microservices"));

	}

	private static void printLengthOfEachCourse(List<String> course) {
		System.out.println(course.stream().map(str->str.length()).collect(Collectors.toList()));
		
	}

	private static void printEvenNumbersInList(List<Integer> numbers) {
		
		System.out.println(numbers.stream().filter(num1->num1%2==0).collect(Collectors.toList()));
		
		numbers.stream().filter(num1->num1%2==0).map(null);
	}

}
