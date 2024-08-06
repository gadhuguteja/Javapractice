package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FPFlatMapPractice {

	public static void main(String[] args) {
		
		List places = Stream.of(List.of("Kerala","Hyderabad")
				,List.of("Banglore","Chennai"),List.of("Mumbai","Goa"))
				.flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(places);
		
		
		List country = 
				Stream.of(Arrays.asList("Colombia", "Finland", "Greece", "Iceland", "Liberia", "Mali", "Mauritius")
				,Arrays.asList("Peru", "Serbia", "Singapore", "Turkey", "Uzbekistan", "Yemen", "Zimbabwe", "Greece", "Iceland"))
				.flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(country);

	}

}
