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
		Customer.getCustomerEmail();
		Customer.getPhoneNumber();
		Customer.getAccountNumber();
		Customer.getBalance();
		
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
