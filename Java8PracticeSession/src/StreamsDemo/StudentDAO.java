package StreamsDemo;

public class StudentDAO {
	
	public long St_Id;
	public String St_Name;
	public int age;
	public String dept;
	public static final String Collage_Name = "St.Martine Enginnering Collage";
	
	public StudentDAO(long st_Id, String st_Name, int age, String dept) {
		super();
		St_Id = st_Id;
		St_Name = st_Name;
		this.age = age;
		this.dept = dept;
	}

	public long getSt_Id() {
		return St_Id;
	}

	public void setSt_Id(long st_Id) {
		St_Id = st_Id;
	}

	public String getSt_Name() {
		return St_Name;
	}

	public void setSt_Name(String st_Name) {
		St_Name = st_Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getCollage_Name() {
		return Collage_Name;
	}

	@Override
	public String toString() {
		return "StudentDAO [St_Id=" + St_Id + ", St_Name=" + St_Name + ", age=" + age + ", dept=" + dept
				+ ", Collage_Name=" + Collage_Name + "]";
	}
	
	
	

}
