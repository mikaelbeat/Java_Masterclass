package jUnit_Training;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

	@Test
	public void testDeposit() {
		BankAccount account = new BankAccount("Tim","Buchalka",1000.00);
		double balance = account.deposit(200.00, true);
		assertEquals(1200.00, balance,0);
		assertEquals(1200.00, account.getBalance(), 0);
	}

	@Test
	public void testWithdraw() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBalance_deposit() {
		BankAccount account = new BankAccount("Tim","Buchalka",1000.00);
		account.deposit(200.00, true);
		assertEquals(1200.00, account.getBalance(),0);
	}
	
	@Test
	public void testGetBalance_withdraw(){
		BankAccount account = new BankAccount("Tim","Buchalka",1000.00);
		account.withdraw(200.00, true);
		assertEquals(800.00, account.getBalance(), 0);
	}

}
