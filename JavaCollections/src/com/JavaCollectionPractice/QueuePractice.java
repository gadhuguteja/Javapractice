package com.JavaCollectionPractice;

import java.util.*;

public class QueuePractice {

	public static void main(String[] args) {
		
		Queue<String> qc = new ArrayDeque<>();
		
		qc.offer("Rampavan");
		qc.offer("Murali");
		qc.offer("Hanu");
		qc.offer("Yash");
		qc.offer("Chai");
		qc.offer("Teja");
		qc.offer(null);
		
		
		
		for (String string : qc) {
			System.out.println(qc);
		}
		/* System.out.println(qc); */
		
//		System.out.println(qc.contains("Murali"));
//		System.out.println(qc.hashCode());
		/* System.out.println(qc.poll()); */
		/* System.out.println(qc); */
		 
		
		

	}

}
