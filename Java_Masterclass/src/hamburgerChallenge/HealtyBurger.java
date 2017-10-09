package hamburgerChallenge;

public class HealtyBurger extends Hamburger{
	
	private boolean pineapple = false;
	private boolean cheese = false;
	private double pineapplePrice = 1;

	public HealtyBurger(String breadType, String meatType) {
		super(breadType, meatType);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void buyAdditions(boolean becon, boolean tomato, boolean hotSauce, boolean lettuce) {
		super.buyAdditions(becon, tomato, hotSauce, lettuce);
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
			
		}
		System.out.println("----------End----------\n");
	}

}



