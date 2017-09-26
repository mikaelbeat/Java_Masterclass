
public class Operators {

	public static void main(String[] args) {
		
		int result = 1 + 2;
		System.out.println("1 + 2 = " + result);
		
		int previousResult = result;
		result = result -1;
		System.out.println(previousResult + " - 1 = " + result);
		
		previousResult = result;
		result = result * 10;
		System.out.println(previousResult + " * 10 = " + result);
		
		previousResult = result;
		result = result / 5;
		System.out.println(previousResult + " / 5 = " + result);
		
		previousResult = result;
		result = result % 3;
		System.out.println(previousResult + " % 3 = " + result);
		
		previousResult = result;
		result = result + 1;
		System.out.println("Result is now " + result);
		result++;
		System.out.println("Result is now " + result);
		result--;
		System.out.println("Result is now " + result);
		result += 2;
		System.out.println("Result is now " + result);
		result *= 10;
		System.out.println("Result is now " + result);
		result -= 10;
		System.out.println("Result is now " + result);
		result /= 10;
		System.out.println("Result is now " + result);
		System.out.println("");
		
		boolean isAlien = false;
		if (isAlien == false)
			System.out.println("It is not an alien!");
		System.out.println("");
		
		int topScore = 90;
		if (topScore >= 90)
			System.out.println("You got highscore!");
		else 
			System.out.println("Not highscore!");
		
		System.out.println("");
		
		int secondTopScore = 90;
			if ((topScore > secondTopScore) && (topScore < 100))
				System.out.println("Greater than top score and less than 100.");
			
			if ((topScore > 90) ||(secondTopScore <= 90))
				System.out.println("One of these tests is true");
			
		boolean isCar = false;
		if (isCar == true)
			System.out.println("Car is true");
		
		isCar = true;
		// Checks is isCar true, if its not true it will return false and nothing is printed.
		boolean wasCar = isCar ? true : false;
		if (wasCar)
			System.out.println("wasCar is true!");
		
		System.out.println("");
		
		double first = 20;
		double second = 80;
		double sum = (first + second) * 25;
		double remainder = sum % 40;
			if (remainder <= 20)
				System.out.println("Total was over the limit, remainder was " + remainder);
		
		
		
		
		
		
		
		
		
			
		
	}

}
 