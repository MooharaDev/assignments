// mohammad alomrani 817571;


import java.util.*;
public class TestBankAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount[] accounts = new BankAccount[4];
		 int actNumber;
		 String actHolder;
		 double balance;
		
		for(int i=0;i<accounts.length;i++) {
			System.out.print("Account Number " + (i+1) + " details: \n\n");
			System.out.print("Enter account holder: ");
			actHolder = input.next();
			System.out.print("Enter account number: ");
			actNumber = input.nextInt();
			
			accounts[i] = new BankAccount(actNumber, actHolder);
			System.out.println();
		}
		
		
		
		int operation = 0, acc;
		double amount;
		
		while(operation != 4) {
			BankAccount.menu();
			System.out.print("Enter Operation: ");
			operation = input.nextInt();
			
			switch (operation) {
			// deposit 
			case 1: {
				System.out.print("Enter the deposit amount: ");
				amount = input.nextDouble();
				System.out.print("which account? from 0-3");
				acc = input.nextInt();
				accounts[acc].deposit(amount);
				break;
			}
			// withdraw
			case 2: {
				System.out.print("Enter the withdraw amount: ");
				amount = input.nextDouble();
				System.out.print("which account? from 0-3 ");
				acc = input.nextInt();
				accounts[acc].withdraw(amount);
				break;
			}
			case 3: {
				for(int i=0;i<accounts.length;i++) {
					System.out.println("\naccount " + (i+1) + " information: ");
					System.out.print(accounts[i].toString());
					System.out.println("\n");
				}
				break;
			}
			default: {
				System.out.print("\n======================\ninvail operation number. TRY AGAIN\n======================\n");
				break;
			}
		
			}
		}
	}
}
