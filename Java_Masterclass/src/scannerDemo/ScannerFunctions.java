package scannerDemo;

import java.util.Scanner;

public class ScannerFunctions {
	
	 static Scanner reader = new Scanner(System.in);
	
	public static void myApplication() {
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
				addStringToTable();
				break;
			case 3:
				//removeContact();
				break;
			case 4:
				//mobilePhone.viewContacts();
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
				 		 "2 - to add text to table.\n"+
				 		 "5 - to quit application"
				);
	}
	
	public static void askToTypeSomething(){
		System.out.print("Type something: ");
		String something = reader.nextLine();
		System.out.println("You typed: " + something);
	}
	
	public static void addStringToTable() {
		
	}

}
