package StreamsDemo;

public class Employee {

	private String name;
	private String department;
	private int age;
	private long salary;
	
	
	
	public Employee(String name, String department, int age, long salary) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	
}
