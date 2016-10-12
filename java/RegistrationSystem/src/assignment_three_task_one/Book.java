package assignment_three_task_one;

public class Book extends Item {
	public Book(String title, double price){
		super(title, price);
	}

	public void printBook(){
		System.out.printf("Printed from Book." + "%n%n");
	}
}
