package hamburgerChallenge;

public class Main{

	public static void main(String[] args) {

		Hamburger hamppari = new Hamburger("wheat", "meat");
		hamppari.buyAdditions(true, true, true, true);
		hamppari.getPrice();
		
		System.out.println("======================================================================\n");
		
		HealtyBurger burgeri = new HealtyBurger();
		burgeri.buyAdditions(true, true, true, true, true, true);
		burgeri.getPrice();

		System.out.println("======================================================================\n");
		
		DeluxeBurger deluxe = new DeluxeBurger();
		
	}

}
