import java.util.Scanner;
public class BankingTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double balance = 20000.0;
		int choice;
		double amount;
		
		System.out.println("--- Banking Transaction ---");
		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Balance");
		System.out.println("Enter Your Choice: ");
		choice = sc.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("Enter Deposit Amount: ");
			amount = sc.nextDouble();
			balance = balance + amount;
			System.out.println("===Amount Deposited Successfully===");
			System.out.println("Avilable Balnce: Rs."+balance);
			break;
		case 2:
			System.out.println("Enter Withdrawal Amount: ");
			amount = sc.nextDouble();
			
			if(amount <= balance) {
				balance = balance - amount;
				System.out.println("===Amount Withdrawn Successfully===");
				System.out.println("Avilable Balnce: Rs."+balance);
			} else {
				System.out.println("Insufficient Balance");
			}
			break;
		case 3:
			System.out.println("Available Balance: Rs."+balance);
			break;
			
			default:
				System.out.println("Invalid Choice");
		}
		sc.close();

	}
}