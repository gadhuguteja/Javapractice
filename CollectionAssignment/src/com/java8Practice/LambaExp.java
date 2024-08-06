package com.java8Practice;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambaExp {

	public static void main(String[] args) {

//		List<Integer> list = List.of(1,4,5,8,9);
//		Collections.sort(list, (a,b)->b-a);
		
		Predicate<Integer> div = no -> no%2 == 0;
		Predicate<Integer> div3 = no -> no%3 == 0;
		Predicate<Integer> div6 = div.and(div3);
		
		System.out.println(div6.test(5));
		

	}

}
