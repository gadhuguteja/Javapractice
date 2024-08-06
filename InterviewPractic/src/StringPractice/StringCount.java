package StringPractice;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Thurkymjal";
		int count = 0;
		
		String str1 = "Thurkymjal";
		
		char[] ch = str.toCharArray();
		
		for(int i = 0; i<ch.length; i++) {
			count++;
		}
		System.out.println("Total count of given string is :" +count);

		System.out.println("Total count for gien string str1 is :" + str1.length());
		
	}

}
