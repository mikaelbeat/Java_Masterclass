package inner_Classes;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");

	public static void main(String[] args) {

		Gearbox mcLaren = new Gearbox(6);
		mcLaren.operateClutch(true);
		mcLaren.changeGear(1);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(1000));
		mcLaren.changeGear(2);
		System.out.println(mcLaren.wheelSpeed(3000));
		mcLaren.operateClutch(true);
		mcLaren.changeGear(3);
		mcLaren.operateClutch(false);
		System.out.println(mcLaren.wheelSpeed(6000));
		
		System.out.println("");
		
//		class ClickListener implements Button.OnClickListener{
//			public ClickListener(){
//				System.out.println("I've been attached.");
//			}
//			
//			@Override
//			public void onClick(String title){
//				System.out.println(title + " was clicked.");
//			}
//		}
//		btnPrint.setOnCLickListener(new ClickListener());
		btnPrint.setOnCLickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(String title) {
				System.out.println(title +" was clicked.");
				
			}
		});
		listen();
	}
	
	private static void listen(){
		boolean quit = false;
		while(!quit){
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice){
			case 0:
				quit = true;
				System.out.println("Quitting.");
				break;
			case 1:
				btnPrint.onCLick();
				break;
			}
		}
	}
	
	

}
