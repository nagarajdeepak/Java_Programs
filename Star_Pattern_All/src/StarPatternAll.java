import java.util.Scanner;
public class StarPatternAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        System.out.println("\nChoose Pattern:");
        System.out.println("1. Left Triangle");
        System.out.println("2. Inverted Left Triangle");
        System.out.println("3. Right Triangle");
        System.out.println("4. Inverted Right Triangle");
        System.out.println("5. Pyramid");
        System.out.println("6. Inverted Pyramid");
        System.out.println("7. Diamond");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1: // Left Triangle
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++)
                        System.out.print("* ");
                    System.out.println();
                }
                break;

            case 2: // Inverted Left Triangle
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= i; j++)
                        System.out.print("* ");
                    System.out.println();
                }
                break;

            case 3: // Right Triangle
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++)
                        System.out.print("  ");
                    for (int j = 1; j <= i; j++)
                        System.out.print("* ");
                    System.out.println();
                }
                break;

            case 4: // Inverted Right Triangle
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= n - i; j++)
                        System.out.print("  ");
                    for (int j = 1; j <= i; j++)
                        System.out.print("* ");
                    System.out.println();
                }
                break;

            case 5: // Pyramid
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++)
                        System.out.print(" ");
                    for (int j = 1; j <= 2 * i - 1; j++)
                        System.out.print("*");
                    System.out.println();
                }
                break;

            case 6: // Inverted Pyramid
                for (int i = n; i >= 1; i--) {
                    for (int j = 1; j <= n - i; j++)
                        System.out.print(" ");
                    for (int j = 1; j <= 2 * i - 1; j++)
                        System.out.print("*");
                    System.out.println();
                }
                break;

            case 7: // Diamond
                // Upper Half
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n - i; j++)
                        System.out.print(" ");
                    for (int j = 1; j <= 2 * i - 1; j++)
                        System.out.print("*");
                    System.out.println();
                }
                // Lower Half
                for (int i = n - 1; i >= 1; i--) {
                    for (int j = 1; j <= n - i; j++)
                        System.out.print(" ");
                    for (int j = 1; j <= 2 * i - 1; j++)
                        System.out.print("*");
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
		}
}