package assignment_three_task_one;

public class ComputerSoftware extends Item{

	public ComputerSoftware(String title, double price, Cart cart){
		super(title, price, cart);
	}

	public void printComputerSoftware(){
		System.out.printf("Printed from Computer Software." + "%n%n");
	}
}
