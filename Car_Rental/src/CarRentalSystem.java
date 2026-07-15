import java.util.Scanner;

class CarRental{
	void rent(int hours) {
		int ratePerHour = 299;
		int total =hours * ratePerHour;
		
		System.out.println("Rental Type: Hourly");
		System.out.println("Hours: "+hours);
		System.out.println("Total Rent: "+total);
	}
	
	void rent(int days, boolean isDayRental) {
		int ratePerDay = 1499;
		int total = days * ratePerDay;
		
		System.out.println("Rental Typer: Daily");
		System.out.println("Days: "+days);
		System.out.println("Toatl Rent: "+total);
	}
	
	void rent(int days, boolean isDayRental, boolean driver) {
		int ratePerDay = 1499;
		int drivercharge = 499;
		int total;
		
		if(driver) {
			total = (days * ratePerDay) + (days * drivercharge);
			System.out.println("Driver: Yes");
		} else {
			total = days * ratePerDay;
			System.out.println("Driver: No");
		}
		System.out.println("Rental Type: Days");
		System.out.println("Days: "+days);
		System.out.println("Total: "+total);
	}
}
public class CarRentalSystem {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CarRental car = new CarRental();
		
		System.out.println("===== Car Rental System =====");
		System.out.println("1. Rent by Hours");
		System.out.println("2. Rent by Days");
		System.out.println("Enter Choice: ");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter the number of Hours: ");
			int hours = sc.nextInt();
			car.rent(hours);
			
		} else if(choice == 2) {
			System.out.println("Enter the number of Days: ");
			int days = sc.nextInt();
			
			System.out.println("Need Driver (Yes/No): ");
			boolean driver = sc.nextBoolean();
			
			car.rent(days, true, driver);
			
		} else {
			System.out.println("Invalid choic");
		}
		sc.close();
	}
}