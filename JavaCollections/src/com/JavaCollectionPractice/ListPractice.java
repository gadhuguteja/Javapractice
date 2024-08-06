package com.JavaCollectionPractice;

import java.util.*;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> searchList = new LinkedList<>();
		
		searchList.add("TCS");
		searchList.add("CTS");
		searchList.add("Info");
		searchList.add("Wipro");
		searchList.add("DXC");
		searchList.add("HCL");
		searchList.add(2, "xyz");
		System.out.println(searchList);
		System.out.println(searchList.get(5));
		

	}

}
