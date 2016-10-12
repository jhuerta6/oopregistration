package assignment_three_task_one;

public class Testing {
	public static void main(String[] args){

		Item test1 = new Item("Test product 1", 33.99);
		Item test2 = new Item("Test product 2", 49.99);

		test1.printData();
		test2.printData();

		MusicCD wilco = new MusicCD("Schmilco", 15.99);
		wilco.printMusicCD();
		wilco.printData();

		Book infinite = new Book("Infinite Jest", 10.99);
		infinite.printBook();
		infinite.printData();

		ComputerSoftware game = new ComputerSoftware("Doom", 29.99);
		game.printComputerSoftware();
		game.printData();

	}
}
