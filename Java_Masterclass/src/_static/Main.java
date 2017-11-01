package _static;

public class Main {
	
	public static int multiplier = 7;

	public static void main(String[] args) {
		
		StaticTest firstInctance = new StaticTest("1st instance.");
		System.out.println(firstInctance.getName()+" is instance number "+
					StaticTest.getNumInstances());
		
		System.out.println("===============================");
		
		StaticTest secondInstance = new StaticTest("2nd instance.");
		System.out.println(secondInstance.getName()+" is instance number "+
				StaticTest.getNumInstances());
		
		System.out.println("===============================");
		
		int answer = multiply(6);
		System.out.println("The answer is "+answer);
		System.out.println("Multiplier is "+multiplier);
		
	}
	
	public static int multiply(int number){
		return number * multiplier;
	}

}
