package scannerDemo;

import java.util.Scanner;

public class PizzaOrder {
	
	static Scanner reader = new Scanner(System.in);
	
	protected static String pizzaSize;
	protected static boolean selectedPizzaSize = false;
	protected static double basePizza;
	
	protected static String Extracheese;
	protected static boolean ExtracheeseSelected = false;
	protected static String salami;
	protected static boolean salamiSelected = false;
	protected static String special;
	protected static boolean specialSelected = false;
	
	protected static double cheesePrice;
	protected static double salamiPrice;
	protected static double specialPrice;
	protected static double toppingsPrice;
	
	protected static boolean oregano = false;
	
	protected static double fullPrice;
	
	public static void selectPizzaSize() {
		pizzaSize = null;
		basePizza = 0.0;
		System.out.println("Available pizza sizes are normal and large.");
		System.out.println("");
		System.out.print("Enter pizza size: ");
		String size = reader.nextLine();
		pizzaSize = size;
		System.out.println("");
		if(pizzaSize.equals("normal")) {
			basePizza += 6.0;
			selectedPizzaSize = true;
			System.out.println("Selected pizza size: "+size);
			System.out.println("");
			System.out.println("Normal size pizza price is: "+basePizza+"€");
		}else if(pizzaSize.equals("large")) {
			basePizza += 12.0;
			selectedPizzaSize = true;
			System.out.println("Selected pizza size: "+size);
			System.out.println("");
			System.out.println("Large size pizza price is: "+basePizza+"€");
		}else {
			selectPizzaSize();
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
			ExtracheeseSelected = true;
			toppingsPrice += cheesePrice;
			System.out.println("Added extra cheese to pizza and total price went up by 1€.");
			double addingCHeese = basePizza+=cheesePrice;
			System.out.println("");
			System.out.println("Pizza price with added extra cheese is "+addingCHeese+"€.");
		}else if(input.equals("no")){
			cheesePrice = 0.0;
			ExtracheeseSelected = false;
			System.out.println("Decided not to add extra cheese to pizza.");
			System.out.println("");
			System.out.println("Pizza price is "+basePizza+"€.");
		}else {
			cheesePrice = 0.0;
			extraCheese();
		}
	}
	
	public static void addSalami() {
		salamiPrice = 0.0;
		System.out.print("Do you want to add salami to your pizza, yes or no? ");
		String input = reader.nextLine();
		System.out.println("");
		if(input.equals("yes")) {
			salamiPrice = 1.5;
			salamiSelected = true;
			toppingsPrice += salamiPrice;
			System.out.println("Added salami to pizza and total price went up by 1.5€.");
			double addingSalami = basePizza+=salamiPrice;
			System.out.println("");
			System.out.println("Pizza price with added salami is "+addingSalami+"€.");
		}else if(input.equals("no")){
			salamiPrice = 0.0;
			salamiSelected = false;
			System.out.println("Decided not to add salami to pizza and total price went up by 1.5€.");
			System.out.println("");
			System.out.println("Pizza price is "+basePizza+"€.");
		}else {
			salamiPrice = 0.0;
			addSalami();
	}
	}
	
	public static void addSpecial() {
		specialPrice = 0.0;
		System.out.print("Do you want to add special topping to pizza, yes or no? ");
		String input = reader.nextLine();
		System.out.println("");
		if(input.equals("yes")){
			specialPrice = 2.5;
			specialSelected = true;
			toppingsPrice += specialPrice;
			System.out.println("Added special topping to pizza and total price went up by 2.5€");
			double addingSpecial = basePizza+=specialPrice;
			System.out.println("");
			System.out.println("Pizza price with added special topping is "+addingSpecial+"€.");
		}else if(input.equals("no")) {
			specialPrice = 0.0;
			specialSelected = false;
			System.out.println("Decided not to add special topping to pizza.");
			System.out.println("");
			System.out.println("Pizzs price is "+basePizza+"€.");
		}else {
			addSpecial();
			specialPrice = 0.0;
		}
	}
	
	public static void selectOregano() {
		System.out.print("Do you want oregano in your pizza, yes or no? ");
		String input = reader.nextLine();
		System.out.println("");
		if(input.equals("yes")){
			oregano = true;
			System.out.println("You chosed to add oregano to pizza, and it is free of charge.");
		}else if(input.equals("no")){
			oregano = false;
			System.out.println("You chosed not to add oregano to pizza.");
		}else {
			selectOregano();
		}
	}
	
	public static void orderPizza() {
		if(selectedPizzaSize == false) {
			System.out.println("You need to at least select pizza size before ordering.");
			PizzaMain.viewPizzaMenu();
		}else {
		System.out.println("*** Pizza order *** ");
		System.out.println("Selected pizza size is "+pizzaSize+" price "+basePizza+"€");
		if(ExtracheeseSelected == true) {
			System.out.println("Extra cheese added to pizza. Price 1€");
		}else {
			System.out.println("Extra cheese not added to pizza.");
		}
		if(salamiSelected == true) {
			System.out.println("Salami added to pizza. Price 1.5€");
		}else {
			System.out.println("Salami not added to pizza.");
		}
		if(specialSelected == true) {
			System.out.println("Special topping added to pizza. Price 2.5€");
		}else {
			System.out.println("Special topping not added to pizza.");
		}
		if(oregano == true) {
			System.out.println("Oregano added to pizza.");
		}else {
			System.out.println("Oregano not added to pizza.");
		}
		System.out.println("");
		double fullPrice = basePizza;
		System.out.println("Price: ");
		System.out.println("Toppings price is. "+toppingsPrice+"€");
		System.out.println("Full price for the pizza is: "+fullPrice+"€");
		System.out.println("");
		System.out.print("Is order ok? ");
		String input = reader.nextLine();
		if(input.equals("yes")) {
			System.out.println("");
			System.out.println("Thanks for pizza order!");
			PizzaMain.quit();
		}else if(input.equals("no")) {
			System.out.println("Returning to pizza order menu.");
			PizzaMain.viewPizzaMenu();
		}
		}
	}
}