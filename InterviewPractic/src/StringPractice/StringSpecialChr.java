package StringPractice;

import java.util.Scanner;

public class StringSpecialChr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input = sc.nextLine();
		int upperCaseletterCount = 0;
		int lowerCaseletterCount = 0;
		int digitCount = 0;
		int specialCharacterCount = 0;
		
		char[] ch = input.toCharArray();
		
		for(char chs : ch) {
			if(Character.isUpperCase(chs))
				upperCaseletterCount++;
			else if(Character.isLowerCase(chs))
				lowerCaseletterCount++;
			else if(Character.isDigit(chs))
				digitCount++;
			else
				specialCharacterCount++;
			
		}
		
		System.out.println("Upper cAase letter count is: " +upperCaseletterCount);
		System.out.println("Lower case letter count is: " +lowerCaseletterCount);
		System.out.println("Digit count is: " +digitCount);
		System.out.println("Special character count is: " +specialCharacterCount);

	}

}
