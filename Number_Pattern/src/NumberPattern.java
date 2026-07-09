import java.util.Scanner;
public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Number Pattern
        System.out.println("\nNumber Pattern:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Reverse Number Pattern
        System.out.println("\nReverse Number Pattern:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}