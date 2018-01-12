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
				extraCheese();
				break;
			case 3:
				addSalami();
				break;
			case 4:
				addSpecial();
				break;
			case 5:
				chooseOregano();
				break;
			case 6:
				sendOrder();
				break;
			case 7:
				checkPrice();
			}
		}
	}
	
	public static void viewPizzaMenu() {
		System.out.println("");
		System.out.println("0 - Menu.\n"+
						   "1 - Choose pizza size.\n"+
						   "2 - Choose to add extra cheese to pizza.\n"+
						   "3 - Choose to add salami as second topping.\n"+
						   "4 - Choose to add special topping."+
						   "5 - Choose oregano.\n"+
						   "6 - Send order.\n"+
						   "7 - Check pizza price.");
	}
	
	public static void choosePizzaSize() {
		PizzaOrder.selectPizzaSize();
		System.out.println("");
		viewPizzaMenu();
	}
	
	public static void extraCheese() {
		PizzaOrder.extraCheese();
		viewPizzaMenu();
	}
	
	public static void addSalami() {
		PizzaOrder.addSalami();
		viewPizzaMenu();
	}
	
	public static void addSpecial() {
		PizzaOrder.addSpecial();
		viewPizzaMenu();
	}
	
	public static void chooseOregano() {
		PizzaOrder.selectOregano();
		viewPizzaMenu();
	}
	
	public static void sendOrder() {
		PizzaOrder.orderPizza();
		viewPizzaMenu();
	}
	
	public static void checkPrice() {
		PizzaOrder.getPizzaPrice();
		viewPizzaMenu();
	}
	
	

}