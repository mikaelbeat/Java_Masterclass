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
	protected boolean oregano;
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
		if(size == "normal") {
			pizzaPrice+=6;
		}else pizzaPrice+=12;
	}
	
	public static void selectTopping1() {
		System.out.print("Enter first topping: ");
		String input = reader.nextLine();
		topping1 = input;
		System.out.print("Selected "+input+" as first topping.");
		if(input != null) {
			topping1Price = 2.5;
		}else topping1Price = 0;
	}
	
	public static void selectTopping2() {
		System.out.print("Enter second topping: ");
		String input = reader.nextLine();
		topping2 = input;
		System.out.print("Selected "+input+" as second topping.");
		if(input != null) {
			topping2Price = 2.5;
		}else topping2Price = 0;
	}
	
	public static void selectTopping3() {
		System.out.print("Enter third topping: ");
		String input = reader.nextLine();
		topping3 = input;
		System.out.println("Selected "+input+" as third topping.");
		if(input != null) {
			topping3Price = 2.5;
		}else topping3Price = 0;
	}
	
	public static void selectOregano() {
		
	}
	
	public static void orderPizza() {
		
	}
	
	public static double getPizzaPrice() {
		
		
		
		return pizzaPrice;
		
	}

}
