package hamburgerChallenge;

public class Main extends Hamburgers{

	public static void main(String[] args) {

		Hamburger hamppari = new Hamburger("wheat", "meat");
		hamppari.buyAdditions(true, true, true, true);
		hamppari.getPrice();

		HealtyBurger hburger = new HealtyBurger("d", "d");
	}

}
