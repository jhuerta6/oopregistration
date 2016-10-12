package assignment_three_task_one;

public class Manager extends User{
	private String employerID;

	public Manager(String name, String username, String password, String employerid){
		super(name, username, password);
		setEmployerID(employerid);
	}
	/*get and set employer ID*/
	public String getEmployerID() {
		return employerID;
	}

	public void setEmployerID(String employerID) {
		this.employerID = employerID;
	}
	/*end get and set employer ID*/
	
}
