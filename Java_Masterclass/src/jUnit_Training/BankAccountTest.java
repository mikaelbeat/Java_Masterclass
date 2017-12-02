package jUnit_Training;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTest {
	
	private BankAccount account;
	private static int count;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("This executes before any test cases. Count = "+count++);
	}
	
	@Before
	public void setup(){
		account = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
		System.out.println("Running test...");
	}

	@Test
	public void testDeposit() {
		double balance = account.deposit(200.00, true);
		assertEquals(1200.00, balance,0);
		assertEquals(1200.00, account.getBalance(), 0);
	}

	@Test
	public void testWithdraw_branch() {
		double balance = account.withdraw(600.00, true);
		assertEquals(400.00, balance, 0);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testWithdraw_notBranch(){
		account.withdraw(600.00, false);
		fail("Should have thrown an IllegalArgumentException");
	}

	@Test
	public void testGetBalance_deposit() {
		account.deposit(200.00, true);
		assertEquals(1200.00, account.getBalance(),0);
	}
	
	@Test
	public void testGetBalance_withdraw(){
		account.withdraw(200.00, true);
		assertEquals(800.00, account.getBalance(), 0);
	}
	
	@Test
	public void isChecking_true(){
		assertTrue("The account is not checking account.",account.isChecking());	
		}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("This executes after all testcases. Count = "+count++);
	}
	
	@After
	public void tearDown(){
		System.out.println("Count = "+count++);
	}

}
