package hamburger_Challenge;

public class DeluxeBurger extends Hamburger{
	
	private String Addition1 = "Chips";
	private String Addition2 = "Coke";

	public DeluxeBurger() {
		super("Deluxe bread", "Deluxe bread");
		this.breadType = "Deluxe white";
		this.meatType = "Deluxe sausage";
		this.basePrice = 20;
		System.out.println("----------Deluxe Hamburger order----------");
		System.out.println(breadType+" bread selected.");
		System.out.println(meatType+" beef selected.");
		System.out.println("Deluxe burger comes with "+Addition1+" and "+Addition2);
		System.out.println("Price for Deluxe Burger is: "+basePrice+"€");	
		System.out.println("----------End----------\n");
	}
}
