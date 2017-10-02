package bank;

public class Bank_Account {
	
	private int accountNumber;
	private double balance;
	private String customerName;
	private String customerEmail;
	private int phoneNumber;
	
	public Bank_Account(){
		this(123456, 0.00, "Customer Name", "Customer email", 000);
		System.out.println("Empty constructor called!");
	}
	
	public Bank_Account(int accountNumber, double balance, String customerName, String customerEmail, int phonenumber){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.phoneNumber = phonenumber;
	}
	
	public Bank_Account(String customerName,  String customerEmail, int phonenumber){
		this(99999, 0.00, customerName, customerEmail, phonenumber);
	}
	
	// Set customer information
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public void depositBalance(int depositBalance){
		this.balance += depositBalance;
		System.out.println("Deposit of "+depositBalance+ " made. New balance is " + this.balance);
	}
	
	public void withdrawalBalance(int withdrawalBalance){
		if(balance >= withdrawalBalance){
			this.balance -= withdrawalBalance;
			System.out.println("Withdrawal of " +withdrawalBalance+ " made, new balance is "+balance+".");
		}else {
			System.out.println("Account balance is " + balance+ ", so withdrawal of "+withdrawalBalance+ 
					" is not possible." );
		}	
	}
	
	
	// Get customer information
	
	
	public String getCustomerName(){
		System.out.println("Customer name is: " +this.customerName);
		return this.customerName;
	}
	
	public String getCustomerEmail(){
		System.out.println("Customer email is: " +this.customerEmail);
		return this.customerEmail;
	}
	
	public int getAccountNumber(){
		System.out.println("Customer account number is: " +this.accountNumber);
		return this.accountNumber;
	}
	
	public double getBalance(){
		System.out.println("Accout balance is: " +this.balance);
		return this.balance;
	}
	
	
	public int getPhoneNumber(){
		System.out.println("Customer phone number is: "+this.phoneNumber);
		return this.phoneNumber;
	}

}
