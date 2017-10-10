package hamburgerChallenge;

public class Main extends Hamburger{





	public Main(String breadType, String meatType) {
		super(breadType, meatType);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Hamburger hamppari = new Hamburger("wheat", "meat");
		hamppari.buyAdditions(true, true, true, true);
		hamppari.getPrice();
		
		HealtyBurger burgeri = new HealtyBurger();
		burgeri.buyAdditions(true, true, true, true, true, true);
		burgeri.getPrice();


		
	}

}
