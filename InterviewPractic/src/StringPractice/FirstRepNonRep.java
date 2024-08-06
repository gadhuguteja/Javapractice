package StringPractice;

import java.util.Scanner;

public class FirstRepNonRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input = sc.nextLine();

		char firstRepChar = ' ';
		char firstNonRepChar = ' ';

		for (int i = 0; i < input.length(); i++) {
			char tempChar = input.charAt(i);
			if (tempChar != 0) {
				if (input.indexOf(tempChar) == input.lastIndexOf(tempChar)) {
					if (firstNonRepChar == ' ') {
						firstNonRepChar = tempChar;
					}
				} else if (firstRepChar == ' ')
					firstRepChar = tempChar;
				if (firstNonRepChar != ' ' && firstRepChar != ' ')
					break;
			}

		}
		System.out.println("First repeated chracter: " + firstRepChar);
		System.out.println("First Non-repeated chracter: " + firstNonRepChar);
	}

}
