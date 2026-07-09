import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		if(num<=1) {
			isPrime=false;
		} else {
			for(int i=2; i<=num/2; i++) {
				if(num%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(num+" is a Prime number");
		} else {
			System.out.println(num+" is Not a Prime number");
		}
		sc.close();
	}

}
