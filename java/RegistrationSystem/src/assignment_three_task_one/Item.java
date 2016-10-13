package assignment_three_task_one;

public class Item{
	private String title;
	private double price;
	
	public Item(String titles, double prices){
		title = titles;
		price = prices;
	}
	
	/* Getters and setters */
	public String getTitle(){
		return title;
	}
	public void setTitle(String titles){
		this.title = titles;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double prices){
		this.price = prices;
	}
	/* End getters and setters */
	
	public void printItemType(){
		System.out.println("Name of the item: " + this.title);
		System.out.printf("This item is of type: " + getClass().getSimpleName() + "%n%n");
	}
	
	public void printData(){ //method used for testing
		System.out.println("Name of the product: " + this.title);
		System.out.printf("This product costs: $" + this.price + "%n%n");
	}
}
