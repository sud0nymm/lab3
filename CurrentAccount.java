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
		
		if (this.getSavingsAccount() != null) {
			if (arg > 0) {
				if (this.getBalance()-arg >= 0) {
					this.setBalance(this.getBalance()-arg);
					this.getSavingsAccount().setBalance(this.getSavingsAccount().getBalance()+arg);
					this.transactions.add("To savings account: ");
					
				}
			}else {
				if (this.getSavingsAccount().getBalance()-arg >= 0) {
					this.getSavingsAccount().setBalance(this.getSavingsAccount().getBalance()-arg);
					this.setBalance(this.getBalance()+arg);
					
					
				}
			}
		}else {
			;
		}
	}
}
