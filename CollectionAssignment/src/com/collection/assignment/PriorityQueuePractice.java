package com.collection.assignment;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class PriorityQueuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Deque<Integer> brids = new ArrayDeque<>();
//		
//		brids.offerFirst(1);
		
//		brids.add("peakock");
		
//		Queue<String> copyBrids = new PriorityQueue<>(brids);
		
//		brids.removeAll(brids);
		
//		System.out.println(brids);
		
//		brids.poll();
//		brids.clear();
		
//		System.out.println(brids);
		
		
		
//		System.out.println(brids);
		
//		for(String s : copyBrids)
//			System.out.println(s);
		
		List<StudentMarks> list = new ArrayList<>();
		
		list.add(new StudentMarks(80, 70));
		list.add(new StudentMarks(100, 60));
		list.add(new StudentMarks(95, 90));
		list.add(new StudentMarks(70, 75));
		list.add(new StudentMarks(30, 60));
		
		List<Integer> top = new ArrayList<>();
		
		Queue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
		
		pq.offer(100);
		pq.offer(35);
		pq.offer(50);
		pq.offer(66);
		int index = 0;
		while(!pq.isEmpty()) {
			if(index == 2)
				break;
			top.add(pq.poll());
			index++;
		}
//		System.out.println(pq);
//		System.out.println(top);
		
//		Queue<StudentMarks> students = new PriorityQueue<>(list);
//		
//		List<StudentMarks> list1 = new ArrayList<>();
//		
//		int index = 0;
//		while(!students.isEmpty()) {
//			if(index == 2)
//				break;
//			list1.add(students.poll());
//			index++;
//		}
//		System.out.println(list1);
		
		NavigableMap<Integer, String> data = new TreeMap<>();
		data.put(1, "TCS");
		data.put(2, "CTS");
		data.put(4, "Infy");
		data.put(3, "HCL");
		
		Set<Map.Entry<Integer, String>> entrySet = data.entrySet();
		for(Map.Entry<Integer, String> entry : entrySet)
			System.out.println(entry.getKey() +" " + entry.getValue());
		
		
		
		
	}

}
