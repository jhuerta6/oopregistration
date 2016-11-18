package UseCases;

import java.util.Set;

public class Class {
	private String title;
	private int courseNumber;
	private String days;
	private String startTime;
	private String endTime;
	private Instructor instructor;
	private Set<Student> students;
	
	public Class(String title, int courseNumber, String days, String startTime, String endTime){
		this.title = title;
		this.courseNumber = courseNumber;
		this.days = days;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	public String getTitle() {
		return this.title;
	}
	public Instructor getInstructor(){
		return this.instructor;
	}
	public Set<Student> getStudents(){
		return this.students;
	}
	public String toString(){
		String s = "Course: " + this.title + 
				"\nCourse number: " + this.courseNumber +
				"\nDays: " + this.days +
				"\nStarts at: " + this.startTime +
				"\nEnds at: " + this.endTime;
		return s;
	}
	public void setInstructor(Instructor i){
		this.instructor = i;
	}

}
