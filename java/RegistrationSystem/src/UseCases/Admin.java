package UseCases;

public class Admin extends User {
	private ClassStore classes;
	private UserService users;

	public Admin(String u, String p, String n, int id, ClassStore classes, UserService users) {
		super(u, p, n, id);
		this.classes = classes;
		this.users = users;
	}
	public void addUser(User user){
		this.users.add(user);
	}
	public void removeUser(User user){
		if(user != null){
			this.users.remove(user);
		}
	}
	public void removeHold(Student student){
		student.removeHold();
	}
	public void addClass(Class course){
		if(course != null){
			this.classes.add(course);
		}
	}
	public void removeClass(Class course){
		if(course != null){
			this.classes.remove(course);
		}
	}
	

}
