package day5.Lab4.Excercise1;

public class CurrentAccount extends Account{
	private double overdraftLimit;

	
	public CurrentAccount() {
		super();
	}

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(super.getBalance()+amount>overdraftLimit) {
			System.out.println("Overdraft limit has been exceeded.");
//			return false;
		}
		else {
			super.withdraw(amount);
//			return true;
		}
		
	} 


}
