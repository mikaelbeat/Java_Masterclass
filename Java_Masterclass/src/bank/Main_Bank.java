package bank;

public class Main_Bank {

	public static void main(String[] args) {
		
		Bank_Account Customer = new Bank_Account(666, 100, "Snake Jones", "snakes@mail.com", 123456);
		
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
		Customer.withdrawalBalance(10000);
		
		System.out.println("");

		Bank_Account testAccount = new Bank_Account("Test", "test@email", 123456);
		System.out.println(testAccount.getPhoneNumber() + " name " + testAccount.getCustomerName());
	
		System.out.println("");
		System.out.println("VIP CUSTOMER - 1, all default values.");
		System.out.println("--------------------------------------------------");
		Vip_Customer Vip = new Vip_Customer();
		Vip.getVipName();
		Vip.getVipCreditLimit();
		Vip.getVipEmailAddress();
		
		System.out.println("");
		System.out.println("VIP CUSTOMER - 2, name and credit limit given, email is default.");
		System.out.println("--------------------------------------------------");
		Vip_Customer Vip2 = new Vip_Customer("GOld", 50000);
		Vip2.getVipName();
		Vip2.getVipCreditLimit();
		Vip2.getVipEmailAddress();
		
		System.out.println("");
		System.out.println("VIP CUSTOMER - 3, all are given.");
		System.out.println("--------------------------------------------------");
		Vip_Customer Vip3 = new Vip_Customer("Mr  Vip", 100000, "mrvip@gold.com");
		Vip3.getVipName();
		Vip3.getVipCreditLimit();
		Vip3.getVipEmailAddress();

	}

}
