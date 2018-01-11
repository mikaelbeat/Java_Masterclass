package scannerDemo;

import java.util.Scanner;

public class PizzaOrder {
	
	static Scanner reader = new Scanner(System.in);
	
	protected static String pizzaSize;
	protected static String topping1;
	protected static String topping2;
	protected static String topping3;
	protected static double topping1Price;
	protected static double topping2Price;
	protected static double topping3Price;
	protected static boolean oregano;
	protected static double pizzaPrice;
	
	public PizzaOrder(String pizzaSize, String topping1, String topping2, String topping3, boolean oregano){
		this.pizzaSize = "Normal";
		this.topping1 = null;
		this.topping2 = null;
		this.topping3 = null;
		this.oregano = false;
		this.pizzaPrice = 0.0;
	}
	
	public static void selectPizzaSize() {
		System.out.println("Available pizza sizes are normal and large.");
		System.out.print("Enter pizza size: ");
		String size = reader.nextLine();
		pizzaSize = size;
		System.out.print("Selected pizza size: "+size);
		if(pizzaSize == "normal") {
			pizzaPrice+=6;
		}else if(pizzaSize =="large") {
			pizzaPrice+=12;
		}
	}
	
	public static void selectTopping1() {
		System.out.print("Enter first topping: ");
		String input = reader.nextLine();
		topping1 = input;
		System.out.print("Selected "+input+" as first topping.");
		if(input != null) {
			topping1Price = 1.0;
		}else topping1Price = 0;
	}
	
	public static void selectTopping2() {
		System.out.print("Enter second topping: ");
		String input = reader.nextLine();
		topping2 = input;
		System.out.print("Selected "+input+" as second topping.");
		if(input != null) {
			topping2Price = 1.5;
		}else topping2Price = 0;
	}
	
	public static void selectTopping3() {
		System.out.print("Enter third topping: ");
		String input = reader.nextLine();
		topping3 = input;
		System.out.println("Selected "+input+" as third topping.");
		if(input != null) {
			topping3Price = 2.0;
		}else topping3Price = 0;
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
		double fullPrice = topping1Price + topping2Price + topping3Price + pizzaPrice;
		System.out.println("Full price for the pizza is: "+fullPrice);
		return fullPrice;
		
	}

}
