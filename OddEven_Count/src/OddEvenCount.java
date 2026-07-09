import java.util.Scanner;
public class OddEvenCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int evencount = 0;
		int oddcount = 0;
		
		for(int i=0; i<n; i++) {
			if(arr[i] % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
		}
		System.out.println("Number of the Even Elements= "+evencount);
		System.out.println("Number of the Odd Elements= "+oddcount);
		
		sc.close();
	}
}