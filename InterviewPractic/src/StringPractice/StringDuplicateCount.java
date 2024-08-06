package StringPractice;

public class StringDuplicateCount {

	public static void main(String[] args) {

		String str = "simple dimple quick";
		char[] ch = str.toCharArray();
		int count = 0;
		char target = 'i';
		
		for(int i = 0; i<ch.length;i++) {
			if(ch[i] == target)
				count++;
		}
		
		System.out.println("Total repeation of target character is :" +count);

	}

}
 