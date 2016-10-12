package assignment_three_task_one;

public class MusicCD extends Item{

	public MusicCD(String title, double price){
		super(title, price);
	}
	
	/*Method from class diagram */
	public void playSample(){
		System.out.println("Method call: playSample()");
	}
	/* End method from class diagram */
	
	public void printMusicCD(){ //test method
		System.out.printf("Printed from MusicCD." + "%n%n");
	}
}
