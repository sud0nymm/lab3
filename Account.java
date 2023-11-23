package lab3;
import java.util.ArrayList;

public class Account {

	private static int accountNumbers = 1;
	private String customer;
	private int thisAccountNumber;
	private double balance;
	protected static Bank theBank;
	protected Account otherAccount;
	protected ArrayList<String> transactions;
	
	public Account(String arg1, double arg2) {
		customer = arg1;
		balance = arg2;
		thisAccountNumber = accountNumbers;
		accountNumbers +=1;
	}
	
	public Account(String arg1, double arg2, double arg3) {
		customer = arg1;
		balance = arg2;
		thisAccountNumber = accountNumbers;
		accountNumbers +=1;
		SavingsAccount savingsAccount = new SavingsAccount(arg1, arg3);
		otherAccount = savingsAccount;
	}
	
	public int getAccountNumber() {
		return thisAccountNumber;
	}
	
	public String getCustomer() {
		return customer;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double arg) {
		balance = arg;
	}
	
	public static void setBank(Bank arg) {
		theBank = arg;
	}
	
	public SavingsAccount getSavingsAccount() {
		SavingsAccount sa = null;
		
		if (otherAccount != null) {
			sa = otherAccount;
		}
		
		return sa;
	}
	
	public String toString() {
		
		String s = "";
		/*if () {	
			s = "Savings Account: "; 
		} else {
			s = "Current Account: "; 
		}*/

		s = s + " with account number " + thisAccountNumber + ": " + balance+"\n";
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < transactions.size(); i++) {
			String addon = transactions.get(i) + "\n";
			builder.append(addon);
		}
		
		return s + builder;
	}
	
	
	
}









