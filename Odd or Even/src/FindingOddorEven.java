import java.util.Scanner;
public class FindingOddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 1st number:");
		int num1 =sc.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("It is a Even number");
		} else {
			System.out.println("It is a Odd number");
		}
		
		System.out.println("Enter 2st number:");
		int num2 =sc.nextInt();
		
		if (num2 % 2 == 0) {
			System.out.println("It is a Even number");
		} else {
			System.out.println("It is a Odd number");
		}
		sc.close();
	}

}
