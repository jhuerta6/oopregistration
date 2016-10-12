package assignment_three_task_one;

public class Item {
	//title as string
	//price as double
	public String title;
	public double price;
	
	public Item(String title, double price){
		this.title = title;
		this.price = price;
	}
	
	public void printData(){
		System.out.println("Name of the product: " + this.title);
		System.out.printf("This product costs: $" + this.price + "%n%n");
	}
}
