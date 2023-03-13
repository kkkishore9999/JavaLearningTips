package oops_concepts;

public class BankAccount_Main {

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
	
	public static void main(String[] args) {
		Bank_Account b1 = new Bank_Account(1111111, "Gus Prestera", 1000.24 );
		
//		private long accountNumber;
//		private String accountName;
//		private double accountBalance;
		
		b1.displayCurrentBalance();
		b1.withdrawlAmount(2000);

		b1.displayCurrentBalance();
		b1.depositAmount(-12);
		b1.displayCurrentBalance();
		
		
	}

}
