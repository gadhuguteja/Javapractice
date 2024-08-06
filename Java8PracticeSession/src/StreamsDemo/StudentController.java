package StreamsDemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentController {

	public static List<StudentDAO> getStudentWithAge(){
		
		return StudentDB.getStudentInfo().stream().filter(st->st.getAge()>17).collect(Collectors.toList());
		
	}
	
	public static List<StudentDAO> getStudentWithName(){
		
		return StudentDB.getStudentInfo().stream().filter(st->st.getSt_Name().endsWith("r")).collect(Collectors.toList());
		
	}
	
	
	/*
	 * public static List<StudentDAO> getStudentWithDept(){
	 * 
	 * return StudentDB.getStudentInfo().stream().filter(st->st.getDept())
	 * .findAny().equals(getStudentWithDept()).;
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		
		StudentController sc = new StudentController();
		
		List<StudentDAO> students = StudentDB.getStudentInfo();
		
		// With lambda Expression
		//students.stream().sorted((s1,s2)-> (s1.getAge()-s2.getAge())).forEach(System.out::println);
		
		//Method Reference comparing method with lambda
		//students.stream().sorted(Comparator.comparing(s->s.getDept())).forEach(System.out::println);
		
		//With Method reference in comparing method
		students.stream().sorted(Comparator.comparing(StudentDAO::getSt_Name)).forEach(System.out::println);
		
		
	
		
		/*
		 * System.out.println(sc.getStudentWithAge());
		 * System.out.println(sc.getStudentWithName());
		 */

	}

}
