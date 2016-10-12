package assignment_three_task_one;

public class MusicCD extends Item{

	public MusicCD(String title, double price){
		super(title, price);
	}

	public void printMusicCD(){
		System.out.printf("Printed from MusicCD." + "%n%n");
	}
}
