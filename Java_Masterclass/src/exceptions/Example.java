package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		try {
			int result = divide();
			System.out.println(result);
		}catch(ArithmeticException | NoSuchElementException e) {
			System.out.println(e.toString());
			System.out.println("Unable to perform division, autopilot shutting down.");
		}
moi

	}
	
	private static int divide() {
		int x,y;
//		try {
			x = getInt();
			y = getInt();
			System.out.println("x is "+x+" and y is "+y+".");
			int result = x / y;
			return result;
//		}catch(NoSuchElementException e) {
//			throw new ArithmeticException("No suitable input.");
//		} catch(ArithmeticException e) {
//			throw new ArithmeticException("Attempt to divide by zero.");
//		}		
	}
	
	private static int getInt() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		while(true) {
			try {
				return s.nextInt();
			}catch(InputMismatchException e) {
				// Go round again. Read past the end of line in the input first.
				s.nextLine();
				System.out.print("Try to enter number again: ");
			}
		}
	}

}
