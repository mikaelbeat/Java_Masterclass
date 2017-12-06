package exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Example {

	public static void main(String[] args) {
		
		int result = divide();
		System.out.println(result);

	}
	
	private static int divide() {
		int x,y;
		try {
			x = getInt();
			y = getInt();
		}catch(NoSuchElementException e) {
			throw new ArithmeticException("No suitable input.");
		}
		System.out.println("x is "+x+" and y is "+y+".");
		try {
			int result = x / y;
			System.out.print("Result is: ");
			return result;
		}catch(ArithmeticException e){
			throw new ArithmeticException("Attempt to divide by zero.");
			
		}

		
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
