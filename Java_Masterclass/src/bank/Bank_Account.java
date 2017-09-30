package bank;

public class Bank_Account {
	
	private int accountNumber;
	private int balance;
	private String customerName;
	private String customerEmail;
	private int phoneNumber;
	
	// Set customer information
	
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	public void depositBalance(int depositBalance){
		this.balance += depositBalance;
		System.out.println("Deposit of "+depositBalance+ " made. New balance is " + this.balance);
	}
	
	public void withdrawalBalance(int withdrawalBalance){
		if(balance > withdrawalBalance){
			this.balance -= withdrawalBalance;
			System.out.println("Withdrawal of " +withdrawalBalance+ " made, new balance is "+balance);
		}else {
			System.out.println("Account balance is " + balance+ ", so withdrawal of "+withdrawalBalance+ 
					" is not possible" );
		}	
	}
	
	public void setCustomerEmail(String email){
		this.customerEmail = email;
	}
	
	public  void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
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
	
	public int getBalance(){
		System.out.println("Accout balance is: " +this.balance);
		return this.balance;
	}
	
	
	public int getPhoneNumber(){
		System.out.println("Customer phone number is: "+this.phoneNumber);
		return this.phoneNumber;
	}

}
