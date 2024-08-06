package com.collection.assignment;

public class StudentMarks implements Comparable<StudentMarks>{
	
	private int maths;
	private int Physics;
	
	
	public StudentMarks(int maths, int physics) {
		super();
		this.maths = maths;
		Physics = physics;
	}


	public int getMaths() {
		return maths;
	}


	public void setMaths(int maths) {
		this.maths = maths;
	}


	public int getPhysics() {
		return Physics;
	}


	public void setPhysics(int physics) {
		Physics = physics;
	}

	

	@Override
	public String toString() {
		return "StudentMarks [maths=" + maths + ", Physics=" + Physics + "]";
	}


	@Override
	public int compareTo(StudentMarks o) {
		// TODO Auto-generated method stub
		return o.maths - this.maths;
	}
	
	
	

}
