import java.util.Scanner;
public class LoanApproval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Salary Per/Month:");
		double salary = sc.nextDouble();
		
		System.out.println("Are You Employeed (true/false):");
		boolean employeed = sc.nextBoolean();
		
		System.out.println("Enter you CIBIL score:");
		int cibilscore = sc.nextInt();
		
		if(salary >= 35000 && employeed == true && cibilscore >= 750) {
			System.out.println("Your loan is Approved");
		} else {
			System.out.println("Your loan is NOT Approved");	
		}
		sc.close();
	}

}
