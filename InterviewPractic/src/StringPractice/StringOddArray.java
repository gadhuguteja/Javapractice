package StringPractice;

import java.util.Arrays;

public class StringOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am working in tcs";
		
		String[] words = str.split(" ");
		String[] outPut = new String[words.length/2];
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			
			if(i%2 != 0) {
				outPut[index] = words[i];
				index++;
			}
		}
		System.out.println("Odd elements Array is :" +Arrays.toString(outPut));

	}

}
