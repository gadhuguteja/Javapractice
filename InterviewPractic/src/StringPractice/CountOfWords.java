package StringPractice;

import java.util.Scanner;

public class CountOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input String :");
		String input = sc.nextLine();
		sc.close();
		
		String[] words = input.split(" ");
		System.out.println(words.length);
	}

}
