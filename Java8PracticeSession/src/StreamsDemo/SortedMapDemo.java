package StreamsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> details = new HashMap<>();

		details.put("Abhi", 789);
		details.put("radh", 296);
		details.put("ganga", 322);
		details.put("vinodh", 426);
		details.put("kali", 458);

		Map<Employee, Integer> maps = new TreeMap<>((o1,o2) ->(int) (o2.getSalary() - o1.getSalary()));

		maps.put(new Employee("abhi", "CSE", 29, 85000), 70);
		maps.put(new Employee("radha", "IT", 25, 60000), 82);
		maps.put(new Employee("ganga", "ECE", 45, 120000), 64);
		maps.put(new Employee("teja", "CSE", 28, 65000), 44);
		maps.put(new Employee("vinodh", "CIVIL", 30, 79000), 69);

//		List<Entry<Employee, Integer>> entries = new ArrayList<>(maps.entrySet());

		maps.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
				.forEach(System.out::println);

//		List<Entry<String, Integer>> entries = new ArrayList<>(details.entrySet());

//		Collections.sort(entries, (o1,o2) -> o1.getKey().compareTo(o2.getKey()));		
//		for(Entry<String, Integer> entry : entries) {
//			System.out.println(entry.getKey() +" " + entry.getValue());
//		}

//		details.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//
//		System.out.println("-----------------------------");
//
//		details.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

	}

}
