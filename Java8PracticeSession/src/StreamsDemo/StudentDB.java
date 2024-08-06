package StreamsDemo;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {
	
	public static List<StudentDAO> getStudentInfo(){
		
		List<StudentDAO> list = new ArrayList();
		
		list.add(new StudentDAO(101,"Sameer",18,"ECE"));
		list.add(new StudentDAO(102,"Sandeepr",19,"Mech"));
		list.add(new StudentDAO(103,"Abhijith",17,"CSE"));
		list.add(new StudentDAO(104,"Balu",21,"Civil"));
		list.add(new StudentDAO(105,"Nandu",20,"EEE"));
		list.add(new StudentDAO(106,"Xavier",17,"CSE"));
	
		return list;
		
	}

}
