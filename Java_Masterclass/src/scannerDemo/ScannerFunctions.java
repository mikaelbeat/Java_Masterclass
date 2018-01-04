package scannerDemo;

import java.util.Scanner;

public class ScannerFunctions {
	
	 static Scanner reader = new Scanner(System.in);
	
	public static void askToTypeSomething(){
		System.out.print("Type something: ");
		String something = reader.nextLine();
		System.out.println("You typed: " + something);
	}
	
	public static void menuActions() {
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while(!quit){
			System.out.println("");
			System.out.print("Choose option: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice){
			case 0:
				printInstructions();
				break;
			case 1:
				addContact();
				break;
			case 2:
				updateContact();
				break;
			case 3:
				removeContact();
				break;
			case 4:
				mobilePhone.viewContacts();
				break;
			case 5:
				turnPhoneOff();
				quit = true;
				break;
			}
		}
	}

}
