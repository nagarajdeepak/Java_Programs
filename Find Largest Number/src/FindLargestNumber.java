import java.util.Scanner;
public class FindLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int a =sc.nextInt();
		
		System.out.println("Enter 2nd Number");
		int b =sc.nextInt();
		
		if(a>b) {
			System.out.println(a+"is the largest number");
		} else if (b>a) {
			System.out.println(b+"is the largest number");
		} else {
			System.out.println("both numbers are equal");
		}
		sc.close();
	}

}
