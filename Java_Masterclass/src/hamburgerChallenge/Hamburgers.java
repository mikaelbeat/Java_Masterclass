package hamburgerChallenge;

class Hamburger{
	
	// Base hamburger
	protected String breadType;
	protected double basePrice = 0;
	private String meatType;
	
	// Additions
	protected boolean becon = false;
	protected double beconPrice = 2.5;
	protected boolean tomato = false;
	protected double tomatoPrice = 0.75;
	protected boolean hotSauce = false;
	protected double hotSaucePrice = 1;
	protected boolean lettuce = false;
	protected double lettucePrice = 0.5;
	
	private double priceBase = 0;
	protected double priceAdditions = 0;
	
	public Hamburger(String breadType, String meatType){
		this.basePrice = 10;
		System.out.println("----------Basic Hamburger order----------");
		if(breadType == "wheat"){
			this.breadType = "wheat";
			System.out.println(breadType+" bread selected.");
		}else if(breadType == "full wheat"){
			this.breadType = "full wheat";
			System.out.println(breadType+" bread selected.");
		}
		if(meatType == "meat"){
			this.meatType = "meat";
			System.out.println(meatType+" beef selected.");
		}else if(meatType == "veggie"){
			this.meatType = "veggie";
			System.out.println(meatType+" beef selected.");
		}
	}
	
	public void buyAdditions(boolean becon, boolean tomato, boolean hotSauce, boolean lettuce){
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
		System.out.println("----------End----------\n");
	}
		
	public double getPrice(){
		double total = basePrice + priceAdditions;
		System.out.println("----------Receipt----------");
		System.out.println("Price for hamburger with "+breadType+" bread and "+meatType+" beef is: "+total+"€");
		System.out.println("Amount of additions from total price "+total+"€ was: "+priceAdditions+"€");
		System.out.println("----------End----------");
		return total;
	}
	
}



//if(tonerLevel >0 && print < tonerLevel){
//	this.tonerLevel = this.tonerLevel-print;
//	this.pagesPrinted += print;
//	System.out.println("Printed "+print+" pages and toner level is at "+tonerLevel+"%");
//}else if(print > tonerLevel){
//	System.out.println("Toner level was at "+tonerLevel+" and tried to print "+print+" pages.");
//}
//}





//class Auto{
//	
//	protected String name;
//	protected int wheels;
//	
//	public Auto(String name, int wheels){
//		this.name = name;
//		this.wheels = wheels;
//	}
//	
//	public String getName(){
//		System.out.println("Name is: "+name);
//		return name;
//	}
//	
//	public int getWheels(){
//		System.out.println("Number of wheels is: "+wheels+ " wheels.");
//		return wheels;
//	}
//
//	public String startEngine(){
//		return "Default engine started.";
//	}
//}

public class Hamburgers {

}
