package com.JavaCollectionPractice;

import java.util.*;

public class VectorPractice {

	public static void main(String[] args) {
		
		
		ArrayList<MyntraWareHouse> v1 = new ArrayList<>();
		
		Vector<MyntraWareHouse> v3 = new Vector<>();
		
		v1.add(new MyntraWareHouse(14526, "Highlander Shoes", "Highlander"));
		v1.add(new MyntraWareHouse(28579, "Tommy Shirt", "Tommy"));
		v1.add(new MyntraWareHouse(78112, "Woodland Shoes", "Woodland"));
		v1.add(new MyntraWareHouse(74332, "H&M Shirt", "H&M"));
		v1.add(new MyntraWareHouse(13547, "Roadstar Jeans", "Roadstar"));
		v1.add(new MyntraWareHouse(64288, "Fossil Watch", "Fossil"));
		
		System.out.println(v1);
		
		
		ArrayList<MyntraWareHouse> v2 = new ArrayList<>();
		
		v2.add(new MyntraWareHouse(14526, "Shoes", "Highlander"));
		v2.add(new MyntraWareHouse(28579, "Shirt", "Tommy"));
		v2.add(new MyntraWareHouse(78112, "Shoes", "Woodland"));
		v2.add(new MyntraWareHouse(74332, "Shirt", "H&M"));
		v2.add(new MyntraWareHouse(13547, "Jeans", "Roadstar"));
		v2.add(new MyntraWareHouse(64288, "Fossil Watch", "Fossil"));
		v2.add(new MyntraWareHouse(14526, "Shoes", "Highlander"));
		v2.add(new MyntraWareHouse(28579, "Shirt", "Tommy"));
		v2.add(new MyntraWareHouse(78112, "Shoes", "Woodland"));
		v2.add(new MyntraWareHouse(74332, "Shirt", "H&M"));
		v2.add(new MyntraWareHouse(13547, "Jeans", "Roadstar"));
		v2.add(new MyntraWareHouse(64288, "Fossil Watch", "Fossil"));
		
		System.out.println(v2.containsAll(v1));
		System.out.println(v2.size());
		System.out.println(v2.subList(2, 5));
		System.out.println(v2);
		
	
		

	}

}
