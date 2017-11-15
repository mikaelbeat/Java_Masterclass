package jUnit_Training;

public class BankAccount {
	
	private String firstName;
	private String lastName;
	private double balance;
	
	public BankAccount(String firstName, String lastName, double balance){
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	
	//Branch is true if customer is performing transaction in bank.
	// Branch is false if customer is performing transaction at an ATM.
	public double deposit(double amount, boolean branch){
		balance += amount;
		return balance;
	}
	
	//Branch is true if customer is performing transaction in bank.
	// Branch is false if customer is performing transaction at an ATM.
	public double withdraw(double amount, boolean branch){
		balance -= amount;
		return balance;
	}
	
	public double getBalance(){
		return balance;
	}

}
