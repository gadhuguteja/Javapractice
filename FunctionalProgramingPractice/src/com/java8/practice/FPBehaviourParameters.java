package com.java8.practice;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FPBehaviourParameters {

	public static void main(String[] args) {
		
		List<Integer> num = List.of(12,16,20,3,5,7,9,14,15,17,21);
		
		/*extracted(num, x->x%2==0);
		
		extracted(num, x->x%2!=0);
		

	}

	private static void extracted(List<Integer> num, Predicate<? super Integer> predicate) {
		num.stream().filter(predicate).forEach(System.out::println);
	}*/
	
	System.out.println("Square of the number:" +extractedMapp(num, x->x*x));
	System.out.println("Trice of the number:" +extractedMapp(num, x->x*x*x));
	System.out.println("two squares of the number:" +extractedMapp(num, x->x*x*x*x));
		
	}

	private static List<Integer> extractedMapp(List<Integer> num, Function<Integer, Integer> mapper) {
		return num.stream().map(mapper).collect(Collectors.toList());
	}

}
