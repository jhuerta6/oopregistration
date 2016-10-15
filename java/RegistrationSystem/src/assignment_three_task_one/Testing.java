package assignment_three_task_one;

import java.util.*;

/* Team Siki */

public class Testing {
	public static void main(String[] args){
		CreditCard sikis = new CreditCard(12345678, "March 2017", 1234);
		CreditCard sikis_two = new CreditCard(87654321, "June 2018", 4321);
		Set<CreditCard> setCards = new HashSet<CreditCard>();
		setCards.add(sikis);
		setCards.add(sikis_two);

		Customer siki = new Customer("Zhoe Siki", "siki", "mizhoesiki", "1234 Juarez Street, Ciudad Juarez", sikis);
		Manager admin = new Manager("Ad Min", "addme", "pass1234", "80978146");
		
		Cart cart = new Cart(siki);
		
		MusicCD wilco = new MusicCD("Schmilco", 15.99, cart);
		Book infinite = new Book("Infinite Jest", 10.99, cart);
		ComputerSoftware game = new ComputerSoftware("Doom", 29.99, cart);
		
		Set<Item> toCart = new HashSet<Item>();
		toCart.add(wilco); 
		toCart.add(wilco); //duplicate item, so the set ignores it
		toCart.add(game);
		toCart.add(infinite);
		
		System.out.println("First we will call all the methods that only should print the method name.");
		siki.browseItem();
		siki.register();
		siki.addToCart(infinite);
		siki.checkoutCart();
		admin.createItem();
		admin.updateItem();
		admin.deleteItem();
		admin.createCustomer();
		admin.updateCustomer(siki);
		admin.deleteCustomer(siki);
		cart.orderByPrice();
		infinite.showPreview();
		wilco.playSample();
		System.out.printf("%n" + "Now we will print the methods that have functionality." + "%n");
		game.printItemType();
		System.out.printf("Total price of your cart: $" + cart.calculateCombinedPrice(toCart) + "%n%n");
		cart.listAllItems(toCart);
		cart.printCustomer(siki);
		siki.allCreditCards(setCards);
	}
}
