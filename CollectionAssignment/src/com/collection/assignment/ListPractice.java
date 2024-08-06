package com.collection.assignment;

import java.util.*;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<>();
		
		
		list.add("Blue");
		list.add("Orange");
		list.add("Pink");
		list.add("Black");
		list.add("Yellow");
		
		int elements = list.size();
		for(int index = 0; index < elements ; index++) {
			System.out.println(list.get(index));
		}
		
		
//		list.set(2, "White");
//		
//		System.out.println(list);
		
//		list.add(0, "Red");
		
//		list.ensureCapacity(6);
//		
//		System.out.println("before Trimming :"+list.size());
//		
//		list.trimToSize();
//		
//		System.out.println("After Trimming :" +list.size());
//		
//		System.out.println(list);
		
//		System.out.println(list.isEmpty());
//		
//		System.out.println("Before Removing :" +list);
//		list.removeAll(list);
//		System.out.println("Afer Removing :" +list);
		
		
//		ArrayList<String> cloneList = (ArrayList<String>) list.clone();
//		
//		System.out.println(cloneList);
//		
//		List<String> copyList = new ArrayList<>(list);
//		copyList.add("Brown");
//		copyList.add("White");
//		copyList.add("Navy Blue");
//		copyList.add("grey");
		
//		System.out.println(copyList);
		
//		System.out.println("Before Swap");
//		for(String a : list)
//			System.out.println(a);
//		
//		
//		Collections.swap(list, 0, 3);
//		
//		System.out.println("After Swapping");
//		for(String b : list)
//			System.out.println(b);
		
//		List<String> copyList = new ArrayList<>();
//		copyList.add("Blue");
//		copyList.add("Brown");
//		copyList.add("White");
//		
//		List<String> colors = new ArrayList<>();
//		
//		for(String e : list) 
//			colors.add(copyList.contains(e) ? "Yes" : "No");
//		System.out.println(colors);
		
		
		
//		list.add(1, "Black");
//		list.remove(2);
		
//		System.out.println(list.indexOf("Orange"));
//		
//		System.out.println(list.get(2));
		
//		if(list.contains("Red")) {
//			System.out.println("Element found at :" +list.indexOf("Red") + " Index");
//		}else {
//			System.out.println("Not found");
//		}
		
		
//		for(String color : list) {
//			
//			System.out.println("Color is :" +color);
//		}
		
//		System.out.println("Before Sorting : " +list);
//		Collections.sort(list);
//		System.out.println("After Sorting:" +list );
//		
//		System.out.println("Copied List" +copyList);
		
//		System.out.println("Before Shuffling " +list);
//		Collections.shuffle(list);
//		System.out.println("After Shuffling " +list);
//		System.out.println("Before reverse" + list);
//		Collections.reverse(list);
//		System.out.println("After reverse" + list);
		
//		System.out.println(list);
//		System.out.println(list.subList(0, 4));
		
	}

}
