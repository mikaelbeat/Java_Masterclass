package arrayListChallenge;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone();
	
	public static void main(String[] args) {
		
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
	
	public static void printInstructions(){
		System.out.println("\nPress: ");
		System.out.println("\t 0 - To view options.");
		System.out.println("\t 1 - To store contact.");
		System.out.println("\t 2 - To update contact.");
		System.out.println("\t 3 - To remove contact.");
		System.out.println("\t 4 - To view all contacts.");
		System.out.println("\t 5 - To turn phone off.");
	}
	
	public static void addContact(){
		System.out.print("Enter contact name: "); 
		mobilePhone.addContact(scanner.nextLine());
	}
	
	public static void updateContact(){
		System.out.print("Enter contact to be updated: ");
		String name = scanner.nextLine();
		System.out.print("Enter new name: ");
		String newName = scanner.nextLine();
		mobilePhone.updateContact(name, newName);
	}
	
	public static void removeContact(){
		System.out.print("Enter contact to be removed: ");
		String contact = scanner.nextLine();
		mobilePhone.removeContact(contact);
	}
	
	public static void turnPhoneOff(){
		System.out.print("Turning phone off.");
	}
}
