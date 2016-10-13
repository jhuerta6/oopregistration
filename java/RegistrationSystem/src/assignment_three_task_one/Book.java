package assignment_three_task_one;

public class Book extends Item {
	public Book(String title, double price){
		super(title, price);
	}

	/*Method from class diagram */
	public void showPreview(){
		System.out.println("Method call: showPreview()");
	}
	/* End method from class diagram */
	
	public void printBook(){ //method used for testing
		System.out.printf("Printed from Book." + "%n%n");
	}
}
