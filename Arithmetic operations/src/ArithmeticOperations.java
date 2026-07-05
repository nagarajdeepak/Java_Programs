import java.util.Scanner;
public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		
		int sum = a+b;
		int difference = a-b;
		int product = a*b;
		int quotient = a/b;
		int remainder = a%b;
		
		System.out.println("sum ="+sum);
		System.out.println("differenc ="+difference);
		System.out.println("product ="+product);
		System.out.println("quotient ="+quotient);
		System.out.println("remainder ="+remainder);
		sc.close();
	}
}