package com.JavaCollectionPractice.map;

import java.util.*;

public class Cities {
	
	public static void main(String[] args) {
		
		Map<Integer,String> st = new HashMap<>();
		st.put(595, "Teja");
		st.put(596, "Sushuu");
		
		/*
		 * Set<Integer> student = st.keySet(); for(Integer sts : student) {
		 * System.out.println(sts); }
		 */
		System.out.println(st);
		st.putIfAbsent(586, "Sowmi");
		System.out.println(st);
		
	}

}
