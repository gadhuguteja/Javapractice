package com.java8.practice;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FPCustomTestData {

	public static void main(String[] args) {
		
		/*
		 * List<Course> courses = List.of(
		 * 
		 * new Course("Spring", "Spring Framework", 95, 20000), new
		 * Course("Spring Boot", "Spring Framework", 98, 18000), new Course("API",
		 * "Microservices", 93, 15000), new Course("Microservices", "Microservices", 99,
		 * 22000), new Course("AWS", "cloud", 91, 19000), new Course("Azure", "cloud",
		 * 95, 28000), new Course("Docker", "cloud", 93, 25000), new
		 * Course("Kubernetes", "cloud", 97, 14000) );
		 * 
		 * 
		 * List<Course> courses2 = List.of(
		 * 
		 * new Course("Spring", "Spring Framework", 95, 20000), new
		 * Course("Spring Boot", "Spring Framework", 98, 18000), new Course("API",
		 * "Microservices", 93, 15000), new Course("Microservices", "Microservices", 99,
		 * 22000), new Course("AWS", "cloud", 91, 19000), new Course("Azure", "cloud",
		 * 95, 28000), new Course("Docker", "cloud", 93, 25000), new
		 * Course("Kubernetes", "cloud", 97, 14000) );
		 */
		
		List<String> courses = List.of("Spring", "Spring Boot","Docker", "AWS", "PCF", "API");
		List<String> courses2 = List.of("Spring", "Spring Boot","Docker", "AWS", "PCF", "API");
		
		// allmatch nonmatch anymatch
		
		Predicate<Course> reviewScoreGreaterThan90predicate = Course -> Course.getReviewScore() > 90;
		Predicate<Course> reviewScoreGreaterLess90predicate = Course -> Course.getReviewScore() < 90;
		Predicate<Course> reviewScoreGreaterThan95predicate = Course -> Course.getReviewScore() < 80;
		  
		  
			/*
			 * System.out.println(courses.stream().allMatch(
			 * reviewScoreGreaterThan90predicate));
			 * System.out.println(courses.stream().anyMatch(
			 * reviewScoreGreaterLess90predicate));
			 * System.out.println(courses.stream().noneMatch(
			 * reviewScoreGreaterThan95predicate));
			 */
		 
		
		
			Predicate<Course> noOfStudentsGreaterThan20000predicate = stn -> stn.getNoOfStudents() >= 20000;
			//System.out.println(courses.stream().anyMatch(noOfStudentsGreaterThan20000predicate));
		 
		
		Comparator<Course> comparingWithReviewScore = Comparator.comparing(Course::getReviewScore);
		
		//System.out.println(courses.stream().sorted(comparingWithReviewScore).collect(Collectors.toList()));
		//System.out.println(courses.stream().collect(Collectors.toList()));
		
		Comparator<Course> comparingWithCourseName = Comparator.comparing(Course::getCourseName)
				.thenComparing(Course::getReviewScore).reversed();
		//System.out.println(courses.stream().sorted(comparingWithCourseName).collect(Collectors.toList()));
		
		// Skip, Limit, takeWhile, doWhile
		
		//System.out.println(courses.stream().sorted(comparingWithReviewScore).collect(Collectors.toList()));
		
		/*
		 * System.out.println(courses.stream().sorted(comparingWithReviewScore) .skip(2)
		 * .limit(3) .collect(Collectors.toList()));
		 */
		
		System.out.println(courses);
		
		//System.out.println(courses.stream().takeWhile(rsc -> rsc.getReviewScore()>=93).collect(Collectors.toList()));
		
		//System.out.println(courses.stream().dropWhile(rsc -> rsc.getReviewScore()>93).collect(Collectors.toList()));
		
		/*
		 * System.out.println(courses.stream().filter(reviewScoreGreaterThan90predicate)
		 * .collect(Collectors.toList()));
		 * 
		 * System.out.println(courses.stream().filter(reviewScoreGreaterThan90predicate)
		 * .min(comparingWithReviewScore));
		 * 
		 * System.out.println(courses.stream().filter(reviewScoreGreaterLess90predicate)
		 * .findAny() .orElse(new Course("Salesforce", "cloud", 89, 14000)));
		 * 
		 * System.out.println("Average");
		 * 
		 * System.out.println(courses
		 * .stream().filter(noOfStudentsGreaterThan20000predicate)
		 * .mapToInt(Course::getNoOfStudents) .max());
		 */
		
		
		/*
		 * System.out.println(courses
		 * .stream().collect(Collectors.groupingBy(Course::getCourseCategory)));
		 * 
		 * System.out.println(courses
		 * .stream().collect(Collectors.groupingBy(Course::getCourseCategory,
		 * Collectors.counting())));
		 * 
		 * System.out.println(courses .stream()
		 * .collect(Collectors.groupingBy(Course::getCourseCategory, Collectors.mapping
		 * (Course::getCourseName, Collectors.toList()))));
		 */
		
		System.out.println(courses.stream().flatMap(course -> courses2.stream().filter(course2 -> course2.length()==course.length())
				.map(course2 -> List.of(course, course2)))
				.filter(list -> !list.get(0)
				.equals(list.get(1))).collect(Collectors.toList()));

	}

}
