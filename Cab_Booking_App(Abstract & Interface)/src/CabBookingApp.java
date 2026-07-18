import java.util.Scanner;
//Interface class
interface CabBooking{
	void bookRide();
	double calculateFare();
	}

//Abstract class
abstract class cab implements CabBooking{
	String customerName;
	double distance;
	
	cab(String customerName, double distance){
		this.customerName = customerName;
		this.distance = distance;
	}
	
	public void bookRide() {
		System.out.println("Ride booked for "+customerName);
	}
}

class miniCab extends cab{

	miniCab(String customerName, double distance) {
		super(customerName, distance);
	}
	
	public double calculateFare() {
		return distance * 12;
	}
}

class AutoCab extends cab{

	AutoCab(String customerName, double distance) {
		super(customerName, distance);
	}
	
	public double calculateFare() {
		return distance * 8;
	}
}

class SedanCab extends cab{

	SedanCab(String customerName, double distance) {
		super(customerName, distance);
	}
	public double calculateFare() {
		return distance * 18;
	}
}
public class CabBookingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Customer Name: ");
		String name  = sc.nextLine();
		
		System.out.println("Enter the Distance (km): ");
		double distance = sc.nextDouble();
		
		System.out.println("\nSelect Cab Types:");
		System.out.println("1.Mini Cab");
		System.out.println("2.Auto Cab");
		System.out.println("3.Sedan Cab");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		cab cab = null;
		
		switch(choice) {
		case 1:
			cab = new miniCab(name, distance);
			break;
		case 2:
			cab = new AutoCab(name, distance);
			break;
		case 3:
			cab = new SedanCab(name, distance);
			break;
		default:
			System.out.println("Invalid Choice");
			System.exit(0);
		}
		
		System.out.println();
		cab.bookRide();
		System.out.println("Customer Name: "+name);
		System.out.println("Distance: "+distance+" km");
		System.out.println("Total Fare:Rs "+cab.calculateFare());
		
		sc.close();
	}
}