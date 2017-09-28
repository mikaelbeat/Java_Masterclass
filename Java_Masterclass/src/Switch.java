import java.util.Scanner;

public class Switch {
	
	static Scanner ifValue = new Scanner(System.in);
	static Scanner switchValue = new Scanner(System.in);
	static Scanner charValue = new Scanner(System.in);
	static Scanner monthValue = new Scanner(System.in);

	public static void main(String[] args) {
		
//	checkIfValue();	
//	checkSwitchValue();
//	checkCharValue();
//	MinimizedCharValue();
		checkMonth();
			

	}
	
	public static void checkCharValue(){
		System.out.print("Enter character: ");
		char value = charValue.next().charAt(0);
		
		switch(value){
		case 'A':
		case 'a':
			System.out.println("Character was A or a.");
			break;
		case 'B':
		case 'b':	
			System.out.println("Character was B or b.");
			break;
		case 'C':
		case 'c':
			System.out.println("Character was C or c.");
			break;
		case 'D':
		case 'd':
			System.out.println("Character was D or d.");
			break;
		case 'E':
		case 'e':
			System.out.println("Character was E or e.");
			break;
		default:
			System.out.println("Character was other than A, B, C, D or E.");
			System.out.println("Actually it was " + value +".");
		}
	}
	
	public static void MinimizedCharValue(){
		System.out.print("Enter character value: ");
		char value = charValue.next().charAt(0);
		
		switch(value){
		case 'a': case 'A': case 'b': case 'B': case 'c': case 'C': case 'd': case 'D': case 'e': case 'E': 
			System.out.println(value + " was found.");
			break;
		default:
			System.out.println(value + " was found.");
			break;
		}

	}
	
	public  static void checkMonth(){
		System.out.print("Enter month to test: ");
		String value = monthValue.next();

		
		switch(value.toLowerCase()){
		case "january":
			System.out.println("Jan");
			break;
		case "june":
			System.out.println("Jun");
			break;
		default:
			System.out.println("Not sure");
			break;
		}
	}
	
	public static void checkSwitchValue(){
		System.out.print("Enter switch value: ");
		int value = switchValue.nextInt();
		
		switch(value){
		case 1:
			System.out.println("Value was 1.");
			System.out.println("");
			break;
		case 2:
			System.out.println("Value was 2.");
			System.out.println("");
			break;
		case 3:case 4:case 5:
			System.out.println("Value was 3, 4 or 5.");
			System.out.println("Actually it was " + value);
			System.out.println("");
			break;
		default:
			System.out.println("Value was other than 1 or 2.");
			break;
		}
	}
	
	
	public static void checkIfValue(){
		System.out.print("Enter if value for test: ");
		int value = ifValue.nextInt();
		
		if(value == 1){
			System.out.println("Value is 1.");
			System.out.println("");
		}else if(value == 2){
			System.out.println("Value is 2.");
			System.out.println("");
		}else {
			System.out.println("Value was other than 1 or 2.");
			System.out.println("");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
