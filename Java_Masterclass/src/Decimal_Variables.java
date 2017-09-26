import java.io.Reader;
import java.util.Scanner;

public class Decimal_Variables {
	
	static Scanner pound = new Scanner(System.in);

	public static void main(String[] args) {
		
		// Width of int is 32.
		int IntValue  = 5 / 2;
		
		// Width of float is 32.
		float FloatValue = 5f / 3f;
		
		// Width of double is 64.
		double DoubleValue = 5d / 3d;
		
		System.out.println("Int values is " + IntValue);
		System.out.println("Float value is " + FloatValue);
		System.out.println("Double value is " + DoubleValue);
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.print("Enter amount of pounds: ");
		double pounds = pound.nextDouble();
		double kilograms = 0.45359237;
		double conversion = pounds * kilograms;
		
		
		System.out.println(pounds +" pounds are in kilograms " + conversion + "kg.");


		}

}
