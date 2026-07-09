import java.util.Scanner;
public class Booking_Resort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String customerName;
		int roomChoice, foodChoice, days;
		double roomcharges = 0, foodcharges = 0, totalBill;
		
		System.out.println("==== KML Resort Booking ====");
		System.out.println("Enter Customer Name: ");
		customerName = sc.nextLine();
		
		System.out.println("\n=== Room Types ====");
		System.out.println("1.Deluxe Room - Rs.1999/Day");
		System.out.println("2.Super Deluxe Room - Rs.3499/Day");
		System.out.println("3.Suti Room - Rs.4999/Day");
		System.out.println("Choose Room: ");
		roomChoice = sc.nextInt();
		
		System.out.println("Enter Number Of Days: ");
		days = sc.nextInt();
		
		switch(roomChoice) {
		case 1:
			roomcharges = 1999 * days;
			break;
		case 2:
			roomcharges = 3499 * days;
			break;
		case 3:
			roomcharges = 4999 * days;
			break;
		default:
			System.out.println("Invalid Room Choice");
			return;
		}
		System.out.println("\n==== Food Packages ====");
		System.out.println("1. Breakfast - Rs.299/Day");
		System.out.println("2. Breakfast + Lunch - Rs.599/Day");
		System.out.println("3. Breakfast + Lunch + Dinner - Rs.999/Day");
		System.out.println("Enter Food Choise: ");
		foodChoice = sc.nextInt();
		
		switch(foodChoice){
		case 1:
			foodcharges = 299 * days;
			break;
		case 2:
			foodcharges = 599 * days;
			break;
		case 3:
			foodcharges = 999 * days;
			break;
		default:
			System.out.println("Invalid Food Choice");
			return;
		}
		totalBill = roomcharges + foodcharges;
		
		System.out.println("\n==== Booking Details ====");
		System.out.println("Customer Name: "+customerName);
		System.out.println("Number Days: "+days);
		System.out.println("Room Charges: Rs."+roomcharges);
		System.out.println("Food Charges: Rs."+foodcharges);
		System.out.println("Total Bill : Rs."+totalBill);
		
		sc.close();
	}
}