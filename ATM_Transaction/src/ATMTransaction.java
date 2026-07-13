import java.util.Scanner;
public class ATMTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int balance = 1000;
		int withdrawalMoney = 0;
		int depositingMoney = 0;
		boolean isTrue = true;

		while (isTrue) {
			System.out.println();
			System.out.println("============= Welcome to XYZ Bank =============");
			System.out.println("Please select one of the following options:");
			System.out.println("1. Withdraw Money");
			System.out.println("2. Deposit Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int selection = sc.nextInt();
			switch (selection) {
			case 1:
				System.out.print("Enter the amount to withdraw: ");
				withdrawalMoney = sc.nextInt();
				balance = withDraw(withdrawalMoney, balance);
				break;
			case 2:
				System.out.print("Enter the amount to deposit: ");
				depositingMoney = sc.nextInt();
				if (depositingMoney > 0) {
					balance += depositingMoney;
					System.out.println("Amount deposited successfully.");
				} else {
					System.out.println("Invalid amount. Please enter an amount greater than Rs. 0.");
				}
				break;
			case 3:
				System.out.println("Available Balance: Rs. " + balance + "/-");
				break;
			case 4:
				System.out.println("Thank you for banking with XYZ Bank.");
				isTrue = false;
				break;
			default:
				System.out.println("Invalid choice. Please select a valid option.");
				break;
			}
		}
		sc.close();
	}
	static int withDraw(int money, int balance) {

		if (money <= 0) {
			System.out.println("Invalid amount. Please enter an amount greater than Rs. 0.");
		}
		else if (balance - money >= 1000) {
			balance -= money;
			System.out.println("Transaction completed successfully.");
		}
		else {
			System.out.println("Transaction failed.");
			System.out.println("Insufficient balance. A minimum balance of Rs. 1000 must be maintained.");
		}

		return balance;
	}

}
