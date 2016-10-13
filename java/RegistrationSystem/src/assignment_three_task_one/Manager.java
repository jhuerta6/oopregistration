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
	
	/* Methods from class diagram */
	public void createItem(){
		System.out.println("Method call: createItem()");
	}
	public void updateItem(){
		System.out.println("Method call: updateItem()");
	}
	public void deleteItem(){
		System.out.println("Method call: deleteItem()");
	}
	public void createCustomer(){
		System.out.println("Method call: createCustomer()");
	}
	public void updateCustomer(Customer c){
		System.out.println("Method call: updateCustomer()");
	}
	public void deleteCustomer(Customer c){
		System.out.println("Method call: deleteCustomer()");
	}
	/* End methods from class diagram */
	
}
