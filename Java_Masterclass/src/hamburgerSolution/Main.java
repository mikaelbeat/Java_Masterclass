package hamburgerSolution;

public class Main {

	public static void main(String[] args) {
		
		Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheese", 1.12);
		System.out.println("Total burger price is: "+hamburger.itemizeHamburger());
		
		System.out.println("");
		
		HealtyBurger healtyburger = new HealtyBurger("Bacon", 5.67);
		healtyburger.addHealtyAddition1("Egg", 5.43);
		healtyburger.addHealtyAddition2("Lentils", 3.41);
		System.out.println("Total Healty Burger price is "+healtyburger.itemizeHamburger());
		
		System.out.println("");
		
		DeluxeBurger deluxe = new DeluxeBurger();
		deluxe.itemizeHamburger();

	}

}
