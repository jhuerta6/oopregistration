package UseCases;

import java.util.HashSet;
import java.util.Set;

public class Instructor extends User {
	private Set<Class> classes;

	public Instructor(String u, String p, String n, int id) {
		super(u, p, n, id);
		this.classes = new HashSet<Class>();
	}

}
