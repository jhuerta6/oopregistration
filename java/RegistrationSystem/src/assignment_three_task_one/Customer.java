package assignment_three_task_one;

public class Customer extends User{
	private String homeAddress;

	public Customer(String name, String username, String password, String homeaddress){
		super(name, username, password);
		homeAddress = homeaddress;
	}
	/* get and set homeAddress*/
	public String getHomeAddress(){
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress){
		this.homeAddress = homeAddress;
	}
	/*end get and set homeAddress*/
	
	/* Methods from class diagram */
	public void addToCart(Item t){
		System.out.println("Method call: addToCart(Item t)");
	}
	public void checkoutCart(){
		System.out.println("Method call: checkoutCart()");
	}
	/* End methods from class diagram */
	
	public void allCreditCards(){
		
	}
	
	
}
