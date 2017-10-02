package bank;

public class Vip_Customer {
	
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	public Vip_Customer() {
		this("Default name", 10000, "default email address");
	}
	
	public Vip_Customer(String name, double creditLimit){
		this(name, creditLimit, "Default email address");
	}
	
	public Vip_Customer(String name, double creditLimit, String emailAddress){
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	

	


	public String getVipName(){
		System.out.println("Vip customer name is: " +this.name);
		return this.name;
	}
	
	public double getVipCreditLimit(){
		System.out.println("Credit limit is: " +this.creditLimit);
		return this.creditLimit;
	}

	public String getVipEmailAddress(){
		System.out.println("Vip customer email address is: " +this.emailAddress);
		return this.emailAddress;
	}
	

	
	
	
	
	
	
	
	
	


}
