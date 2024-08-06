package StreamsDemo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emp = DataBase.getEmployees();
		
		
		
		Collections.sort(null);
		
//		emp.stream().forEach(System.out::println);
		
//		List<Employee> list = emp.stream().filter(t->t.getAge()<=30).collect(Collectors.toList());
		
		List<Employee> list = emp.stream().filter(t->t.getName().startsWith("A")).collect(Collectors.toList());
		
		emp.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
		
		emp.stream().sorted((o1,o2)-> (int) (o2.getSalary()-o1.getSalary())).forEach(System.out::println);
		
		
		
//		System.out.println(list);
	}

}
