package UseCases;

import java.util.HashSet;
import java.util.Set;

public class ClassStore {
	private Set<Class> classes;
	
	public ClassStore(){
		this.classes = new HashSet<Class>();
	}

	public void add(Class course) {
		this.classes.add(course);
	}
	public void remove(Class course){
		for(Class c: this.classes){
			if(this.classes.equals(c)){
				this.classes.remove(c);
			}
		}
	}
	public Set<Class> getClasses(){
		return this.classes;
	}
}
