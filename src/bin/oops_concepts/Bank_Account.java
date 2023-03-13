package oops_concepts;

public class Bank_Account {
	/**
	 * ***Exercise****
	 * 1. Create a Bank_Account class
	 * 2. Create private member variables for Account Number, Account Name and Account Balance
	 * 3. Create methods to deposit and withdraw the amount and to display the current Balance
	 * 4. Create an constructor with arguments for Account Number, Name and Balance
	 * 4. Create a class BankAccount_Main with a main method 
	 * 5. Create an object of Bank_Account
	 * 6. Call the methods to deposit and withdraw the money from Bank Account and Display the current Balance
	 */
	
	
	private long accountNumber;
	private String accountName;
	private double accountBalance;
	
	public void depositAmount(double amount) {
		if(amount > 0) {
			accountBalance = accountBalance + amount;
			System.out.println("Successfully deposited " + amount);
		}
		else {
			System.out.println("Cannot deposit: " + amount);
		}
		
	}
	
	public void withdrawlAmount(double amount) {
		if(amount > 0) {
			accountBalance = accountBalance - amount;
			System.out.println("Successfully Withdrawl amount" + amount );
		}
		else {
			System.out.println("Cannot withdrawl: " + amount);
		}
		
	}
	

	public void displayCurrentBalance() {
		System.out.println("Your Current Balance: " + accountBalance);
	}
	
	
	public Bank_Account(long accountNumber, String accountName, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	
}
