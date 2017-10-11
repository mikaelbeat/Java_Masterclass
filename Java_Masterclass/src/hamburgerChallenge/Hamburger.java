package hamburgerChallenge;

public class Hamburger {
	
	// Base hamburger
	protected String breadType;
	protected double basePrice = 0;
	protected String meatType;
	
	// Additions
	protected boolean bacon = false;
	protected double baconPrice = 2;
	protected boolean tomato = false;
	protected double tomatoPrice = 1;
	protected boolean hotSauce = false;
	protected double hotSaucePrice = 0.5;
	protected boolean lettuce = false;
	protected double lettucePrice = 1;

	protected double priceAdditions = 0;
	
	public Hamburger(String breadType, String meatType){
		this.basePrice = 10;
		if(breadType == "wheat"){
			System.out.println("----------Basic Hamburger order----------");
			this.breadType = "wheat";
			System.out.println(breadType+" bread selected.");
		}else if(breadType == "full wheat"){
			this.breadType = "full wheat";
			System.out.println("----------Basic Hamburger order----------");
			System.out.println(breadType+" bread selected.");
		}
		if(meatType == "meat"){
			this.meatType = "meat";
			System.out.println(meatType+" beef selected.");
			System.out.println("Price for base Hamburger is: "+basePrice+"€");
			System.out.println("----------End----------\n");
		}else if(meatType == "veggie"){
			this.meatType = "veggie";
			System.out.println(meatType+" beef selected.");
			System.out.println("Price for base Hamburger is: "+basePrice+"€");
			System.out.println("----------End----------\n");
		}
	}
	
	public void buyAdditions(boolean becon, boolean tomato, boolean hotSauce, boolean lettuce){
		System.out.println("----------Additions for Basic Hamburger----------");
		if(becon == true){
			this.bacon = true;
			this.priceAdditions += baconPrice;
			System.out.println("bacon added, price is: "+baconPrice+"€");
		}else if(becon == false){
			this.bacon = false;
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
		System.out.println("----------End----------\n");
	}
		
	public double getPrice(){
		double total = basePrice + priceAdditions;
		System.out.println("----------Receipt----------");
		System.out.println("Price for hamburger with "+breadType+" bread and "+meatType+" beef is: "+total+"€");
		System.out.println("Amount of additions from total price "+total+"€ was: "+priceAdditions+"€");
		System.out.println("----------End----------");
		System.out.println("");
		return total;
	}
}
