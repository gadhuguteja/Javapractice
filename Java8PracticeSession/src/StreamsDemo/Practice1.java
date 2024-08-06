package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Practice1 {

	public static void main(String[] args) {
		List<String> li = Arrays.asList("Teja","Om","Ram","Amruth","","rudra");
		//long strlist = li.stream().filter(x->x.isEmpty()).count();
		//System.out.printf("Missing count is:"+ strlist,li);
		
		/* String with more than 3 char
		 * long cn = li.stream().filter(x->x.length()>3).count();
		 * System.out.printf("String with count ore than three :"+ cn,li);
		 */
		
		/*Starts with A count
		 * long num = li.stream().filter(x->x.startsWith("A")).count();
		 * System.out.printf("Count of name starts with A:" + num);
		 */
		/*
		 * List<String> s1 =
		 * li.stream().filter(x->!x.isEmpty()).collect(Collectors.toList());
		 * System.out.println(s1);
		 */
		
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		String G7Countries = G7.stream() .map(x -> x.toUpperCase()) .collect(Collectors.joining(", ")); 
		System.out.println(G7Countries);
		System.out.println(G7);

		
	}

}
