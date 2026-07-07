import java.util.Scanner;
public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Consumer ID: ");
        int consumerId = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Consumer Name: ");
        String consumerName = sc.nextLine();

        System.out.print("Enter number of months: ");
        int months = sc.nextInt();

        double totalBill = 0;

        for (int i = 1; i <= months; i++) {

            System.out.println("\nMonth " + i);

            System.out.print("Enter Previous Reading: ");
            int previousReading = sc.nextInt();

            System.out.print("Enter Current Reading: ");
            int currentReading = sc.nextInt();

            int units = currentReading - previousReading;

            double billAmount = 0;

            if (currentReading < previousReading) {
                System.out.println("Invalid Reading!");
                continue;
            }

            // Slab calculation
            if (units <= 50) {
                billAmount = units * 2;
            }
            else if (units <= 100) {
                billAmount = (50 * 2) + ((units - 50) * 5);
            }
            else {
                billAmount = (50 * 2) + (50 * 5)
                           + ((units - 100) * 8);
            }

            totalBill += billAmount;

            System.out.println("Units Consumed : " + units);
            System.out.println("Bill Amount    : ₹" + billAmount);
        }

        System.out.println("\n------ Final Report ------");
        System.out.println("Consumer ID   : " + consumerId);
        System.out.println("Consumer Name : " + consumerName);
        System.out.println("Total Bill for " + months + " Months : ₹" + totalBill);

        sc.close();
	}

}