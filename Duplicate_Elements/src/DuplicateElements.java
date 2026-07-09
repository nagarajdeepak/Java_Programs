import java.util.Scanner;
public class DuplicateElements {

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
		System.out.println("Duplicate elements are:");
		
		boolean found = false;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					found = true;
					break;
				}
			}
		}
		if(!found) {
			System.out.println("No duplicate element found");
		}
		sc.close();
	}
}