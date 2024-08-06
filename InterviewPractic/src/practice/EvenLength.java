package practice;

public class EvenLength {

	
	public static void printString(String str) {
		
		for(String word: str.split(" ")) {
			if(word.length()%2 ==0) {
				System.out.println(word);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am working in TCS as Java developer";
		printString(str);

	}

}
