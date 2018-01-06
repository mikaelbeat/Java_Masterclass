package scannerDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerFunctions {
	
	static Scanner reader = new Scanner(System.in);
	
	private static ArrayList<String> textArray = new ArrayList<String>();
	
	public static void myApplication() {
		textArray.add("Monkey");
		textArray.add("Snake");
		boolean quit = false;
		int choice = 0;
		viewMenu();
		while(!quit){
			System.out.println("");
			System.out.print("Choose option: ");
			choice = reader.nextInt();
			reader.nextLine();
			System.out.println("");
			
			switch(choice){
			case 0:
				viewMenu();
				break;
			case 1:
				askToTypeSomething();
				break;
			case 2:
				addStringToArray();
				break;
			case 3:
				showTextArrayContent();
				break;
			case 4:
				removeStringFromArray();
				break;
			case 5:
				System.out.println("Quitting application.");
				quit = true;
				break;
			}
		}
	}
	
	public static void viewMenu(){
		System.out.println("0 - to view options menu.\n"+
				 		 "1 - to try type something.\n"+
				 		 "2 - to add string to table.\n"+
				 		 "3 - show text array content.\n"+
				 		 "4 - remove string from text array.\n"+
				 		 "5 - to quit application"
				);
	}
	
	public static void askToTypeSomething(){
		System.out.print("Type something: ");
		String something = reader.nextLine();
		System.out.println("You typed: " + something);
	}
	
	public static void addStringToArray() {
		System.out.print("Add text to array: ");
		String text = reader.nextLine();
		textArray.add(text);
		System.out.println(text+" added to array.");
		
	}
	
	public static void showTextArrayContent() {
		for(int i=0; i<textArray.size(); i++) {
			System.out.println("In position "+(1+i)+" is "+textArray.get(i));
		}
	}
	
	public static void removeStringFromArray() {
		System.out.println("Strings in text array are: ");
		for(String i : textArray) {
			System.out.print(i);
		}
		System.out.println("Enter text to be removed: ");
		String text = reader.nextLine();
		textArray.remove(text);
		System.out.println(text+" removed from text array.");
	}

}
