package day5.Lab4.Excercise1;

public class SavingsAccount extends Account{
	
	private final double minimumBalance=500;
	
	public SavingsAccount() {
		super();
	}

	

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(super.getBalance()-amount>minimumBalance){
			System.out.println("The amount of Rs."+amount+" is withdrawn from the account");
			super.withdraw(amount);
		}
		else System.out.println("The amount cannot be withdrawn from the account as there is no required minimum balance");
	}
	
}
