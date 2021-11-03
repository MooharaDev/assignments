// mohammad alomrani 817571
public class BankAccount {
	
	private int actNumber;
	private String actHolder;
	private double balance = 0;
	
	
	BankAccount(int actNumber, String actHolder) {
		this.actNumber = actNumber;
		this.actHolder = actHolder;

	}
	
	
	public int getActNumber(){
		return actNumber;
	}
	
	public String getActHolder(){
		return actHolder;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setActNumber(int accNo) {
		actNumber = accNo;
	}
	
	public void setActHolder(String holder) {
		actHolder = holder;
	}
	
	void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount){
		if(balance >= amount) {
			balance -= amount;
		}
	}
	public String toString() {
		return "Holder: " + actHolder + "\nAccount Number: " + actNumber + "\nCurrent Balance: " + balance;
	}
	
	public static void menu() {
	
		System.out.print("1 - Make a deposit. \n2 - Withdraw money. \n3 - List all accounts with current information. \n4 - Quit.\n");


		}
	
			
}

