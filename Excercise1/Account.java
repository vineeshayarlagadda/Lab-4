package day5.Lab4.Excercise1;

public class Account {
	private long accNum=101;
	private double balance;
	private Person accHolder;
	
	
	public Account() {
		super();
	}
	

	public Account(Person accHolder) {
		super();
		this.accHolder = accHolder;
	}


	//-----------getters and setters----------
	
	public long getAccNum() {
		long a=accNum;
		accNum+=1;
		return a;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance+=amount;	
		System.out.println("An amount of Rs."+amount+" is deposited in the bank account.");
	}
	
	public void withdraw(double amount) {
		System.out.println("An amount of Rs."+amount+" is withdrawn from the bank account.");
		balance-=amount;	
	}

}
