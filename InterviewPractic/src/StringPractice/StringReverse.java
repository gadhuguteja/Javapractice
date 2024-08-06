package StringPractice;

import java.util.Iterator;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		
		String input = sc.nextLine();
		
		String reverse = "";
		
		for(int i = input.length()-1; i>=0; i--) {
			reverse += input.charAt(i);
		}
		System.out.println("Output string: "+ reverse);

	}

}
