package UseCases;

import java.util.HashSet;
import java.util.Set;

public class Student extends User {
	private StudentClassification classification;
	private boolean hold;
	private double gpa;
	private Set<Class> classes;

	public Student(String u, String p, String n, int id) {
		super(u, p, n, id);
		this.classes = new HashSet<Class>();
	}
	public void register(Class course){
		if(course != null)
			this.classes.add(course);
	}
	public void unregister(Class course){
		if(course != null){
			for(Class c: this.classes){
				if(course.equals(c)){
					this.classes.remove(c);
				}
			}
		}
	}
	public Set<Class> getClasses(){
		return this.classes;
	}
	public double getGPA(){
		return this.gpa;
	}
	public boolean checkHold(){
		return this.hold;
	}
	public void removeHold() {
		this.hold = false;
	}

}
