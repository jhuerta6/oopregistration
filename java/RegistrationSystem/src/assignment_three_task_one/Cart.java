package assignment_three_task_one;

import java.util.*;

public class Cart {

	public double calculateCombinedPrice(Set<Item> cart){ //implement the set, calculate combined price of all the items in the screen
		double combinedPrice = 0;
		Iterator<Item> it = cart.iterator();
		for(;it.hasNext();){
			combinedPrice += it.next().getPrice();
		}
		//System.out.println("Method call: calculateCombinedPrice()");
		return combinedPrice;
	}

	public void orderByPrice(){
		System.out.println("Method call: orderByPrice()");
	}

	public void listAllItems(Set<Item> toCart) {
		Iterator<Item> it = toCart.iterator();
		System.out.println("This cart contains the following items: ");
		for(;it.hasNext();){
			it.next().printData();
		}
	}

	public void printCustomer(Customer person){ //should print customer name and customer ID
		System.out.printf("Customer's name: " + person.getName() + "%n" + 
				"Customer's ID: " + person.getUsername() + "%n%n"
				);
	}

}
