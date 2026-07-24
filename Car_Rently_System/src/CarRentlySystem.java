import java.util.*;
public class CarRentlySystem {
	static ArrayList<Car>cars = new ArrayList<>();
	static ArrayList<Rental>rentals = new ArrayList<>();
	
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String agrs[]) {
		cars.add(new Car(1,"Hyundai",1500));
		cars.add(new Car(2,"Toyota",2500));
		cars.add(new Car(3,"Honda",3500));
		
		int choice;
		
		do {
			System.out.println("\n-----Car Rental System -----");
			System.out.println("1.View Available Cars");
			System.out.println("2.Rent Car");
			System.out.println("3.Return Car");
			System.out.println("4.Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			
			switch(choice){
			case 1:
				showAvailableCars();
				break;
			case 2:
				rentCar();
				break;
			case 3:
				returnCar();
				break;
			case 4:
				System.out.println("Thank you");
				break;
				default:
					System.out.println("Invalid choice");
			}
		} while(choice != 4);
	}
	
	static void showAvailableCars() {
		System.out.println("\nAvailable cars");
		for(Car car : cars) {
			if(car.isAvailable) {
				System.out.println(car.carId+" - "+car.brand+ "-Rs"+car.rentPerDay+"/day");
			}
		}
	}
	
	static void rentCar() {
		System.out.println("Enter Car ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		for(Car car : cars) {
			if(car.carId == id && car.isAvailable) {
				System.out.println("Enter Customer Name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter Days: ");
				int days = sc.nextInt();
				
				Customer customer = new Customer(rentals.size()+1, name);
				Rental rental = new Rental(car, customer, days);
				
				rentals.add(rental);
				car.isAvailable = false;
				
				double total = days * car.rentPerDay;
				
				System.out.println("Car rented successfuly");
				System.out.println("Total Cost: Rs"+total);
				return; 
			}
		}
		System.out.println("Car not avaliable");
	}
	
	static void returnCar() {
		System.out.println("Enter Car ID to return: ");
		int id = sc.nextInt();
		
		for(Rental rental : rentals) {
			if(rental.car.carId == id) {
				rental.car.isAvailable = true;
				rentals.remove(rental);
				System.out.println("Car Returned successfullu");
				return;
			}
		}
		System.out.println("Invalid Car ID");
	}
}
