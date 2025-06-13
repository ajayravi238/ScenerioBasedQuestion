import java.util.*;

class BankAccount {
    private long accountNumber;
    private String holderName;
    private double balance;
    
    public BankAccount(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    public void deposite(double depositeAmount) {
        balance += depositeAmount;
        System.out.println(depositeAmount + " deposited successfully.");
    }
    
    public void withdraw(double withdrawAmount) {
        if(balance > withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + " withdrawn successfully.");
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
    
    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
    
    public String display() {
        return "Name: " + holderName + " Account Number: " + accountNumber + " Balance: " + balance;
    }
}

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double balance = sc.nextDouble();
		double withdrawAmount = sc.nextDouble();
		double depositeAmount = sc.nextDouble();
		sc.nextLine();
		String holderName = sc.nextLine();
		long accountNumber = sc.nextLong();
		
		BankAccount b = new BankAccount(accountNumber, holderName, balance);
		b.withdraw(withdrawAmount);
		b.deposite(depositeAmount);
		b.checkBalance();
		b.display();
	}
}
