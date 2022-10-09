package Cshw3;

import java.util.Date;

public class testAccount{
	
	public static void main(String[] args) {
		
		Account account1=new Account(1122,20000);
		
		account1.setAnnualInterestRate(4.5);
	    account1.withdraw(2500);
		account1.deposit(3000);
		System.out.println("the balance of the account is "+account1.getBalance());
		System.out.println(" the monthly interest of the account is "+ account1.getMonthlyInterest());
		System.out.println(" the date the account was created was on "+ account1.getDateCreated());
		
}
	
}

 class Account {
	
	private int id=0;
	private double balance= 0;
	private double annualInterestRate=0;
	private java.util.Date dateCreated= new java.util.Date();
	
	Account(){
	}
	
	Account(int newid, double newBalance){
		id=newid;
		balance=newBalance;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int newid) {
		id=newid;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(int newBalance) {
		balance=newBalance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate=newAnnualInterestRate;
	}
	
	public Date getDateCreated()
	{
		return dateCreated;
		
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public double getMonthlyInterest() {
		return balance*(annualInterestRate/100)/12;
	}
	
	public double withdraw(double w) {
		balance = balance-w;
		return balance;
	}
	
	public double deposit(double d) {
		balance=balance+d;
		return balance;
	}
	}



