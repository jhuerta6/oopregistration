package assignment_three_task_one;

import java.util.*;

public class Customer extends User{
	private String homeAddress;
	public CreditCard creditcard;

	public Customer(String name, String username, String password, String homeaddress, CreditCard creditcard){
		super(name, username, password);
		homeAddress = homeaddress;
		this.creditcard = creditcard;
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

	public void allCreditCards(Set<CreditCard> card){ //set of CreditCards
		Iterator<CreditCard> it = card.iterator();
		int i = 1;
		for(;it.hasNext();){
			System.out.println("Credit Card #" + i );
			it.next().getInfo(); //helper method
			i++;
		}
		System.out.println();
	}

}
