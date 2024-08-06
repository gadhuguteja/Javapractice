package practice;

public class FactorialOfNo {

	
	static int factorilNo(int n) {
		
		int result = 1;	
		
		for(int i = 1 ; i<=n; i++)
			result = result*i;
		
		return result;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 6;
		System.out.println("Factorial of given number is:" +factorilNo(n));
	}

}
