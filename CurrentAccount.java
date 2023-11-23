package lab3;

public class CurrentAccount extends Account {

	public CurrentAccount(String arg1, double arg2) {
		super(arg1,arg2);
		super.otherAccount = null;
	}
	
	public CurrentAccount(String arg1, double arg2, double arg3) {
		super(arg1,arg2,arg3);
		super.otherAccount = null;
	}
	
	public void savings(double arg) {
		//check if savings account is attached to current account
		//if not, do nothing
		//if yes, distinguish between double >/< 0 (transfer to or from)
		//make sure that balances of both accounts stay over 0 if transfer
		//if arg>0 money goes from current account to savings account
		//if arg=<0 money goes from savings account to current account
	}
}
