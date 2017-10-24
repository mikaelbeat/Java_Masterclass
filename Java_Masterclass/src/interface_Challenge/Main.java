package interface_Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean quit = false;
		menu();
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
			case 0:
				System.out.println("Game shutting down");
				quit = true;
				break;
			case 1:
				menu();
				break;
			case 2:
				addHero();
				break;
			case 3:
				viewHeroes();
				break;
			case 4:
				removeHero();
				break;
			case 5:
//				addMonster();
				break;
			case 6:
//				viewMosters();
				break;
			case 7:
//				removeMonster();
				break;
			}
		}

	}
	
	public static void loadApplication(){
	//	Hero.Loaded();
	}
	
	public static void addHero(){
		System.out.println("Enter name of the hero: ");
		String name = scanner.nextLine();
		Hero.addHero(name);
	}
	
	public static void viewHeroes(){
		Hero.getHeroes();
	}
	
	public static void removeHero(){
		System.out.println("Enter name of the hero to be removed: ");
		String name = scanner.nextLine();
		Hero.removeHero(name);
	}

	private static void menu() {
		System.out.println("Available actions:\n" + 
						   "0 - to quit.\n" + 
				           "1 - to view menu.\n" + 
						   "2 - to add heroes.\n"+ 
				           "3 - to view heroes.\n" + 
						   "4 - to remove hero.\n" + 
				           "5 - to view monsters.\n");
	}

}
