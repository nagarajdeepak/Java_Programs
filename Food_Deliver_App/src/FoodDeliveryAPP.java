import java.util.Scanner;

interface FoodDelivery{
	void placeOrder();
	double calculateBill();
}

abstract class Customer implements FoodDelivery{
	String customerName;
	String customerAddress;
	
	Customer(String customerName, String customerAddress){
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	public void placeOrder() {
		System.out.println("Order Placed Sucessfully for "+customerName);
	}
}

class VegThali extends Customer{
	int quantity;
	VegThali(String customerName, String customerAddress, int quantity) {
		super(customerName, customerAddress);
		this.quantity = quantity;
	}
	public double calculateBill() {
		return quantity * 250;
	}
}

class NonVegThali extends Customer{
	int quantity;
	NonVegThali(String customerName, String customerAddress, int quantity) {
		super(customerName, customerAddress);
		this.quantity = quantity;
	}
	public double calculateBill() {
		return quantity * 350;
	}
}

class Snacks extends Customer{
	int quantity;
	Snacks(String customerName, String customerAddress, int quantity) {
		super(customerName, customerAddress);
		this.quantity = quantity;
	}
	public double calculateBill() {
		return quantity * 150;
	}
}
public class FoodDeliveryAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Customer Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Customer Address: ");
		String address = sc.nextLine();
		
		System.out.println("\nSelect Food");
		System.out.println("1.Veg Thail");
		System.out.println("2.NON-Veg Thali");
		System.out.println("3.Snacks");
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		
		System.out.print("Enter Quantity: ");
		int qyt = sc.nextInt();
		
		Customer order = null;
		
		switch(choice) {
		case 1: 
			order = new VegThali(name, address, qyt);
			break;
		case 2: 
			order = new NonVegThali(name, address, qyt);
			break;
		case 3: 
			order = new Snacks(name, address, qyt);
			break;
		default:
			System.out.println("Invalid choice");
			System.exit(0);
		}
		
		System.out.println();
		System.out.println("Customer Name: "+name);
		System.out.println("Customer Address: "+address);
		System.out.println("Quantity Ordered: "+qyt);
		System.out.println("Total Bill: Rs "+order.calculateBill());
		
		sc.close();
	}

}
