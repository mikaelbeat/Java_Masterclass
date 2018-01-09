package scannerDemo;

import java.util.Scanner;

public class PizzaMain {
	
	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean quit = false;
		int choice = 0;
		viewPizzaMenu();
		
		while(!quit) {
			choice = reader.nextInt();
			reader.nextLine();
			System.out.println("");
			
			switch(choice) {
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
				break;
			case 6:
				sendOrder();
			}
		}
	}
	
	public static void viewPizzaMenu() {
		System.out.println("");
		System.out.println("0 - Menu.\n"+
						   "1 - Choose pizza size.\n"+
						   "2 - Choose topping 1.\n"+
						   "3 - Choose topping 2.\n"+
						   "4 - Choose topping 3.\n"+
						   "5 - Choose oregano.\n"+
						   "6 - Send order.");
	}
	
	public static void choosePizzaSize() {
		PizzaOrder.selectPizzaSize();
		System.out.println("");
		viewPizzaMenu();
	}
	
	public static void chooseTopping1() {
		PizzaOrder.selectTopping1();
	}
	
	public static void chooseTopping2() {
		PizzaOrder.selectTopping2();
	}
	
	public static void chooseTopping3() {
		PizzaOrder.selectTopping3();
	}
	
	public static void chooseOregano() {
		PizzaOrder.selectOregano();
	}
	
	public static void sendOrder() {
		PizzaOrder.orderPizza();
	}
	
	

}
