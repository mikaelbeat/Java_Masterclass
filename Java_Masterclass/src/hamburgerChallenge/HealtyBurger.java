package hamburgerChallenge;

public class HealtyBurger extends Hamburger{
	
	private boolean pineapple = false;
	private double pineapplePrice = 2.5;
	private boolean cheese = false;
	private double cheesePrice = 2;
	
	public HealtyBurger() {
		super("brown rye", "healty");
		this.breadType = "brown rye";
		this.meatType = "healty";
		this.basePrice = 15;
		System.out.println("----------Healty Hamburger order----------");
		System.out.println(breadType+" bread selected.");
		System.out.println(meatType+" beef selected.");
		System.out.println("Price for base Healty Burger is: "+basePrice+"€");	
		System.out.println("----------End----------\n");
	}

	
	public void buyAdditions(boolean becon, boolean tomato, boolean hotSauce, boolean lettuce, 
			boolean pineapple, boolean cheese) {
		System.out.println("----------Additions for Healty Burger----------");
		if(becon == true){
			this.becon = true;
			this.priceAdditions += beconPrice;
			System.out.println("becon added, price is: "+beconPrice+"€");
		}else if(becon == false){
			this.becon = false;
		}
		if(tomato == true){
			this.tomato = true;
			this.priceAdditions += tomatoPrice;
			System.out.println("tomato added, price is: "+tomatoPrice+"€");
		}else if(tomato == false){
			this.tomato = false;
		}
		if(hotSauce == true){
			this.hotSauce = true;
			this.priceAdditions += hotSaucePrice;
			System.out.println("hot sauce added, price is: "+hotSaucePrice+"€");
		}else if(hotSauce == false){
			this.hotSauce = false;
		}
		if(lettuce == true){
			this.lettuce = true;
			this.priceAdditions += lettucePrice;
			System.out.println("lettuce added, price is: "+lettucePrice+"€");
		}else if(lettuce == false){
			this.lettuce = false;
		}
		if(pineapple == true){
			this.pineapple = true;
			this.priceAdditions += pineapplePrice;
			System.out.println("pineapple added, price is: "+pineapplePrice+"€");
		}else if(pineapple == false){
			this.pineapple = false;
		}
		if(cheese == true){
			this.cheese = true;
			this.priceAdditions += pineapplePrice;
			System.out.println("cheese added, price is: "+cheesePrice+"€");
		}else if(cheese == false){
			this.cheese = false;
		}
		System.out.println("----------End----------\n");
	}
	
	public double getPrice(){
		double total = basePrice + priceAdditions;
		System.out.println("----------Receipt----------");
		System.out.println("Price for hamburger with "+breadType+" bread and "+meatType+" beef is: "+total+"€");
		System.out.println("Amount of additions from total price "+total+"€ was: "+priceAdditions+"€");
		System.out.println("----------End----------\n");
		System.out.println("");
		return total;
	}

}



