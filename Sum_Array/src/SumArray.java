import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int sum = 0;
		
		System.out.println("Enter the array elements:");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		// calculate the sum of array elements
		for(int i=0; i<n; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of array elements= "+sum);
		
		sc.close();
	}

}
