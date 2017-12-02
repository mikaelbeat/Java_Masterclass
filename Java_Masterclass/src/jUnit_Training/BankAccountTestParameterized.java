package jUnit_Training;

import org.junit.Before;

public class BankAccountTestParameterized {
	
	private BankAccount account;
	
	@Before
	public void setup() {
		account = new BankAccount("Tim","Buchalka", 1000.00, BankAccount.CHECKING);
		System.out.println("Running a test...");
	}

}
