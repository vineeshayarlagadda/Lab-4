package day5.Lab4.Excercise1;

import java.util.*;
public class MainBankAccount {
	static Account a[] = new Account[1000];
	static Scanner sc = new Scanner(System.in);
	static int index = 0;
	public static void main(String[] args) {
		MainBankAccount ma = new MainBankAccount();
		
		while(true) {
			System.out.println("Enter the requirement:\n1. Create a new account\n2. WithDraw\n3. Deposit\n4. Display Details");
			
			int option = sc.nextInt();
			switch(option) {
			     case 1:
			    	 ma.insertAccount();
			    	 break;
			     case 2:
			    	 System.out.println("Enter the withdraw amount");
			    	 double amount = sc.nextDouble(); 
			    	 ma.withdrawAmount(amount);
			    	 break;
			     case 3:
			    	 System.out.println("Enter the deposit amount");
			    	 double amount1 = sc.nextDouble(); 
			    	 ma.depositAmount(amount1);
			    	 break;
			     case 4:
			    	 System.out.println(index);
			    	 for(int i=0;i<index;i++) {
			    		 ma.display(a[i]);
			    	 }
			    	  
			    	 
			}
		}

	}
	public void insertAccount() {
		 System.out.println("Enter the Account holder name : ");
    	 String name = sc.next();
    	 System.out.println("Enter the Account holder age : ");
    	 float age = sc.nextFloat();
    	 Person p = new Person(name,age);
    	 Account a = new Account(p);
    	 System.out.println("Enter the Initial Balance : ");
    	 double bal = sc.nextDouble();
    	 a.setBalance(bal);
    	 addAccount(a);
	}
	
	public void addAccount(Account account) {
		a[index++] = account;
	}
	public void depositAmount(double amount) {
		for(int i=0;i<index;i++) {
			a[i].deposit(amount);
		}
	}
	public void withdrawAmount(double amount) {
		for(int i=0;i<index;i++) {
			a[i].withdraw(amount);
		}
	}
	public void display(Account acc) {
		System.out.println("============================================");
//		System.out.println(acc);
		System.out.println("The Account Holder Number : "+acc.getAccNum());
		System.out.println("The Account Holder Name : "+acc.getAccHolder().getName());
		System.out.println("The Account Balance : "+acc.getBalance());
	}
}