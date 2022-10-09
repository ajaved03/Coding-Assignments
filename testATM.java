package Cshw107;
import java.util.Scanner;
import java.util.Date;

public class testATM {
		public static void main (String[] args) {
			Scanner input = new Scanner(System.in);
			Account[] accounts= new Account[10];
			
			for(int i=0; i<accounts.length;i++) {
				accounts[i]=new Account(i,100);
			}
		int number=0;
		
		int id= askForID(accounts);
		
		while(number!=4) {
			Account user1= getAccount(accounts, id);
			System.out.print("Main menu\n" +"1: check balance\n" + "2: withdraw\n" +"3: deposit\n" +
			"4: exit\n" + "Enter a choice: ");
		number=input.nextInt();
			
			if(number==1) {
			System.out.println("The balance is $" + user1.getBalance() + ".\n");
			}
			
			else if(number==2) {
				System.out.print("Enter an amount to withdraw: ");
                user1.withdraw(input.nextDouble());
			}
			
			else if(number==3) {
				 System.out.print("Enter an amount to deposit: ");
                 user1.deposit(input.nextDouble());
			}
			else {
				System.out.println("Logged out...");
                System.out.println("");
                id = askForID(accounts);
                number = 0;
			}
			
			
		}
		}
		
		
	public static int askForID(Account[] accounts) {
		Scanner input= new Scanner(System.in);
		
		int id=0;
		
		boolean idFalse= false;
		
		while (!idFalse) {
			System.out.print("Enter Id :");
			id=input.nextInt();
			
		   if(!hasID(accounts, id)) {
			   System.out.println(" Wrong ID, enter again");
		   }
		   else {
			   idFalse=true;
		   }
			
			
			
		}
				
		return id;
	}
	
	
	public static Account getAccount( Account [] accounts, int id) {
		
		for (Account account: accounts) {
			if(id== account.getId()) {
				return account;
			}
		}
		return null;
	}
	
	
	public static boolean hasID( Account[] accounts, int id) {
		
		for ( Account account: accounts) {
			if( id== account.getId()) {
				return true;
			}
		}
		return false;
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
