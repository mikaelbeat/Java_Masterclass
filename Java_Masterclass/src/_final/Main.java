package _final;

public class Main {

	public static void main(String[] args) {
		
		SomeClass one = new SomeClass("One");
		SomeClass two = new SomeClass("Two");
		SomeClass three = new SomeClass("Three");
		
		System.out.println(one.getInstanceNumber());
		System.out.println(two.getInstanceNumber());
		System.out.println(three.getInstanceNumber());
		
		System.out.println("=================================");
		
		int pw = 674312;
		Password password = new Password(pw);
		password.storePassword();
		password.letMeIn(1);
		password.letMeIn(323223);
		password.letMeIn(674312);
		
		// Tsekkaa t‰‰ viel‰ l‰pi kokonaan

	}

}
