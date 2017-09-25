
public class Hello {

	public static void main(String[] args) {
		
		int Number1 = (5 + 5) + 10;
		int Number2 = 20;
		int Number3 = 5;
		
		
		System.out.println("Number 1 is "+ Number1);
		System.out.println("Number 2 is "+ Number2);
		System.out.println("Number 3 is "+ Number3);
		
		int Total = Number1 + Number2 + Number3;
		
		System.out.println("");
		System.out.println("Total is " + Total);
		
		System.out.println("");
		
		int Tax = 10;
		
		int AfterTaxes = Total - Tax;
		System.out.println("After taxes total is "+ AfterTaxes);

	}

}
