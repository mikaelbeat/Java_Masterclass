package bank;

public class Main_Bank {

	public static void main(String[] args) {
		
		Bank_Account Customer = new Bank_Account();
		
		Customer.setCustomerName("Python");
		Customer.setAccountNumber(666);
		Customer.setBalance(10000);
		Customer.setCustomerEmail("python@snake.jungle");
		Customer.setPhoneNumber(123456);
		
		Customer.getCustomerName();
		System.out.println("Customer email is: " + Customer.getCustomerEmail());
		System.out.println("Customer phone number is: " + Customer.phoneNumber());
		System.out.println("Account number is: " + Customer.getAccountNumber());
		System.out.println("Account balance is: " + Customer.getBalance());
		
		System.out.println("");
		
		Customer.setBalance(10000);
		Customer.depositBalance(5000);
		
		System.out.println("");
		
		Customer.setBalance(10000);
		Customer.withdrawalBalance(11000);
		
		System.out.println("");

		
		
		// video 7:09
		

	}

}
