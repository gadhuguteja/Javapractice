package com.java8.practice;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FPExampleSPractice {

	public static void main(String[] args) {
		List<String> data = List.of("Telangana","KA","TN","","KL","","WB","Texsas");
		
		List<Integer> square = List.of(2,4,5,3,7,8,3,4,7);
		
		System.out.println(data.stream().filter(x->x.isEmpty()).count());
		
		System.out.println(data.stream().filter(x->x.length()>3).count());
		
		System.out.println(data.stream().filter(x->x.startsWith("T")).collect(Collectors.toList()));
		System.out.println(data);
		
		System.out.println(data.stream().filter(x->!x.isEmpty()).collect(Collectors.toList()));

		System.out.println(data.stream()
				.map(x->x.toUpperCase())
				.collect(Collectors.joining(",")));
		
		Function<Integer,Integer> squareMapper = x->x*x;
		Function<Integer,Integer> cubeMapper = x->x*x*x;
		
		//System.out.println(square.stream().map(cubeMapper).distinct().collect(Collectors.toList()));
		
		IntSummaryStatistics stats = square.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println(stats.getMin());
		
	}
	

}
