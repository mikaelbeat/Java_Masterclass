package scannerDemo;

import java.util.Scanner;

public class PizzaMain {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean quit = false;
		int choise = 0;
		viewPizzaMenu();
		
		while(!quit) {
			System.out.println("");
			System.out.println("*** Pizza order ***");
			choice = reader.nextInt();
			reader.nextLine();
			System.out.println("");
			
			switch(choise) {
			case 0:
				viewPizzaMenu();
				break;
			case 1:
				choosePizzaSize();
				break;
			case 2:
				chooseTopping1();
				break;
			case 3:
				chooseTopping2();
				break;
			case 4:
				chooseTopping3();
				break;
			case 5:
				chooseOregano();
				break
			case 6:
				sendOrder();
			}
		}
		

	}

}
