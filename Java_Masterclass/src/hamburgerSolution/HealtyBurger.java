package hamburgerSolution;

public class HealtyBurger extends Hamburger{
	
	private String healtyExtra1name;
	private double healtyExtra1Price;
	
	private String healtyExtra2name;
	private double healtyExtra2Price;
	
	public HealtyBurger(String meat, double price) {
		super("Healty", meat, price, "Brown rye");
		// TODO Auto-generated constructor stub
	}
	
	public void addHealtyAddition1(String name, double price){
		this.healtyExtra1name = name;
		this.healtyExtra1Price = price;
	}
	
	public void addHealtyAddition2(String name, double price){
		this.healtyExtra2name = name;
		this.healtyExtra2Price = price;
	}
	
	@Override
	public double itemizeHamburger(){
		double hamburgerPrice = super.itemizeHamburger();
		if(this.healtyExtra1name != null){
			hamburgerPrice += this.healtyExtra1Price;
			System.out.println("Added "+this.healtyExtra1name+" for an extra "+this.healtyExtra1Price);
		}
		if(this.healtyExtra2name !=  null){
			hamburgerPrice += this.healtyExtra2Price;
			System.out.println("Added "+this.healtyExtra2name+" for an extra "+this.healtyExtra2Price);
		}
		return hamburgerPrice;
	}
	
	

}
