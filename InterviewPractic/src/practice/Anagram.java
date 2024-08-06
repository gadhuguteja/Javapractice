package practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "he is lIsteN";
		String str2 = "He iS SiLeNT";
		
		str.replace(" ", "");
		str2.replace(" ", "");
		
		str = str.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] a = str.toCharArray();
		char[] b = str2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result = Arrays.equals(a, b);
		if(result == true) {
			System.out.println("It is a anagram");
		}else {
			System.out.println("It is not a anagram");
		}

	}

}
