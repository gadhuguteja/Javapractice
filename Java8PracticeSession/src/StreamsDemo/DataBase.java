package StreamsDemo;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	
		public static List<Employee> getEmployees(){
			List<Employee> list = new ArrayList<>();
			list.add(new Employee("Sagar", "IT", 32, 20000));
			list.add(new Employee("vivek", "ECE", 30, 50000));
			list.add(new Employee("Amar", "Mech", 40, 90000));
			list.add(new Employee("Vidhya", "EEE", 26, 25000));
			list.add(new Employee("zabber", "Civil", 28, 35000));
			list.add(new Employee("Akram", "CSE", 42, 75000));
			return list;
		}
	
}
