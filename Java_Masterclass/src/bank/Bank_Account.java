package bank;

public class Bank_Account {
	
	private int accountNumber;
	private int balance;
	private String customerName;
	private String customerEmail;
	private int phoneNumber;
	
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
	
	public String getCustomerName(){
		System.out.println("Customer name is " +this.customerName);
		return this.customerName;
	}
	
	public int getAccountNumber(){
		return this.accountNumber;
	}
	
	public int getBalance(){
		return this.balance;
	}
	
	public String getCustomerEmail(){
		return this.customerEmail;
	}
	
	public int phoneNumber(){
		return this.phoneNumber;
	}

}
