package assignment_three_task_one;

public class Customer extends User{
	private String homeAddress;

	public Customer(String name, String username, String password, String homeaddress){
		super(name, username, password);
		homeAddress = homeaddress;
	}

	public String getHomeAddress(){
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress){
		this.homeAddress = homeAddress;
	}
}
