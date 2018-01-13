package scannerDemo;

import java.util.Scanner;

public class PizzaOrder {
	
	static Scanner reader = new Scanner(System.in);
	
	protected static String pizzaSize;
	protected static String Extracheese;
	protected static String salami;
	protected static String special;
	protected static double cheesePrice;
	protected static double salamiPrice;
	protected static double specialPrice;
	protected static boolean oregano;
	protected static double basePizza;
	
	public static void selectPizzaSize() {
		pizzaSize = null;
		basePizza = 0.0;
		System.out.println("Available pizza sizes are normal and large.");
		System.out.print("Enter pizza size: ");
		String size = reader.nextLine();
		pizzaSize = size;
		System.out.println("Selected pizza size: "+size);
		if(pizzaSize.equals("normal")) {
			basePizza += 6.0;
			System.out.println("Pizza price is: "+basePizza);
		}else if(pizzaSize.equals("large")) {
			basePizza += 12.0;
			System.out.println("Pizza price is: "+basePizza);
		}else {
			System.out.println("Select normal or large size for the pizza.");
		}
	}
	
	public static void extraCheese() {
		cheesePrice = 0.0;
		System.out.print("Do you want to add extra cheese to your pizza, yes or no? ");
		String input = reader.nextLine();
		Extracheese = input;
		System.out.println("");
		if(input.equals("yes")) {
			cheesePrice = 1.0;
			System.out.println("Added extra cheese to pizza and total price went up by 1€.");
		}else if(input.equals("no")){
			cheesePrice = 0.0;
			System.out.println("Decided not to add extra cheese to pizza.");
		}else {
			System.out.println("Removed extra cheese from pizza");
			cheesePrice = 0.0;
		}
	}
	
	public static void addSalami() {
		salamiPrice = 0.0;
		System.out.print("Do you want to add salami to your pizza, yes or no? ");
		String input = reader.nextLine();
		System.out.println("");
		if(input.equals("yes")) {
			salamiPrice = 1.5;
			System.out.println("Added salami to pizza.");
		}else if(input.equals("no")){
			salamiPrice = 0.0;
			System.out.println("Decided not to add salami to pizza and total price went up by 1.5€.");
		}else {
			System.out.println("Removed salami from pizza");
			salamiPrice = 0.0;
	}
	}
	
	public static void addSpecial() {
		specialPrice = 0.0;
		System.out.println("Do you want to add special topping to pizza, yes or no? ");
		String input = reader.nextLine();
		System.out.println("");
		if(input.equals("yes")){
			specialPrice = 2.5;
			System.out.println("Added special topping to pizza and total price went up by 2.5€");
		}else if(input.equals("no")) {
			specialPrice = 0.0;
			System.out.println("Decided not to add special topping to pizza.");
		}else {
			System.out.println("Removed special topping from pizza");
			specialPrice = 0.0;
		}

	}
	
	public static void selectOregano() {
		System.out.println("Do you want oregano in your pizza?");
		System.out.print("Yes or no: ");
		String input = reader.nextLine();
		if(input == "yes"){
			oregano = true;
			System.out.println("You chosed to add oregano to pizza.");
		}else {
			oregano = false;
			System.out.println("You chosed not to add oregano to pizza.");
		}
	}
	
	public static void orderPizza() {
		
	}
	
	public static double getPizzaPrice() {
		double fullPrice = cheesePrice + salamiPrice + specialPrice + basePizza;
		System.out.println("Full price for the pizza is: "+fullPrice);
		return fullPrice;
	}

}