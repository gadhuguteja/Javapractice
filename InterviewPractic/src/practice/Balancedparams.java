package practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class Balancedparams {

	static boolean balancedParam(String req) {
		
		
		Deque<Character> dq = new ArrayDeque<Character>();
		
		for(int i =0; i<req.length();i++) {
			char ch = req.charAt(i);
		if(ch == '(' || ch == '{' || ch == '[') {
			dq.push(ch);
			continue;
		}
		
			if(dq.isEmpty())
				return false;
			char check;
			switch(ch) {
			case ')' :
				check = dq.pop();
				if(check == '{' || check == '[')
					return false;
				break;
			case '}' :
				check = dq.pop();
				if(check == '[' || check == '(')
					return false;
				break;
			case ']' :
				check = dq.pop();
				if(check == '(' || check == '{')
					return false;
			break;
			}
		}
		
		return (dq.isEmpty());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String req = "([{}])";
		
		if(balancedParam(req))
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
	}

}
