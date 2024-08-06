package StringPractice;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input Sting");
		String input = sc.nextLine();
		String[] words = input.split(" ");
		String output = "";
		for(int i = 0; i<words.length;i++) {
			String word = words[i];
			String reverse = "";
			for(int j = word.length()-1; j>=0; j--) {
				reverse += word.charAt(j);
			}
			if(i != words.length-1) {
			output += reverse + " ";
			}else
				output += reverse;
		}
		System.out.println("Output String after reverse: "+ output);

	}

}
