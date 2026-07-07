import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter operation (+,-, *, /): ");
		String ch = sc.nextLine();
		
		char op = ch.charAt(0);
		
		switch(1){
			case 1:
	
		//Nested Switch
			switch(op) {
			case '+':
				System.out.println("Add: "+(num1 + num2));
				break;
			case '-':
				System.out.println("Sub: "+(num1 - num2));
				break;
			case '*':
				System.out.println("Mul: "+(num1 * num2));
				break;
			case '/':
				System.out.println("Div: "+(num1 / num2));
				break;
				
				default:
					System.out.println("Invaild Choice");
			}
			sc.close();
		}
	}
}