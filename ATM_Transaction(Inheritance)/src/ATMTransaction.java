import java.util.Scanner;
class Account{
	protected double balance;
	protected final double MIN_BALANCE = 1000;
	
	Account(double balance){
		this.balance = balance;
	}
	void showBalance() {
		System.out.println("Current Balance: Rs"+balance);
	}
}

class ATM extends Account{
	ATM(double balance){
		super(balance);
	}
	
	void deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Invalid Amount NO(-ve)");
		} else {
			balance += amount;
			System.out.println("Rs:"+amount+" Deposited Completed");
			showBalance();
		}
	}
	
	void withdraw(double amount) {
		if(amount <= 0) {
			System.out.println("Invaild Amount NO(-ve)");
		} else if(balance - amount < MIN_BALANCE) {
			System.out.println("Transaction Failed");
			System.out.println("Minimum Balance of Rs"+MIN_BALANCE+" must be maintained");
		} else {
			balance -= amount;
			System.out.println("Rs"+amount+" Withdrawn Successfully");
			showBalance();
		}
	}
}
public class ATMTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Initial Balance: ");
		double initialBalance = sc.nextDouble();
		
		ATM atm = new ATM(initialBalance);
		
		System.out.println("\n1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Balance");
		
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter Deposit Amount: ");
			double amount = sc.nextDouble();
			atm.deposit(amount);
		}
		else if(choice == 2) {
			System.out.println("Enter Withdrawal Amount");
			double amount = sc.nextDouble();
			atm.withdraw(amount);
		}
		else if(choice == 3) {
			atm.showBalance();
		}
		else {
			System.out.println("Invalid Choice");
		}
		sc.close();
	}
}