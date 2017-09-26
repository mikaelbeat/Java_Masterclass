
public class Hello {

	public static void main(String[] args) {
		
		int number1 = (5 + 5) + 10;
		int number2 = 20;
		int number3 = 5;
		
		
		System.out.println("Number 1 is "+ number1);
		System.out.println("Number 2 is "+ number2);
		System.out.println("Number 3 is "+ number3);
		
		int Total = number1 + number2 + number3;
		
		System.out.println("");
		System.out.println("Total is " + Total);
		
		System.out.println("");
		
		int Tax = 10;
		
		int AfterTaxes = Total - Tax;
		System.out.println("After taxes total is "+ AfterTaxes);

	}

}
