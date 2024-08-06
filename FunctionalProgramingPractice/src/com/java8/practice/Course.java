package com.java8.practice;

public class Course {

	public String courseName;
	public String courseCategory;
	public int reviewScore;
	public int noOfStudents;

	Course(String courseName, String courseCategory, int reviewScore, int noOfStudents) {
		super();
		this.courseName = courseName;
		this.courseCategory = courseCategory;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", courseCategory=" + courseCategory + ", reviewScore="
				+ reviewScore + ", noOfStudents=" + noOfStudents + "]";
	}

}
