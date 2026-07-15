import java.util.Scanner;

class Product{
	int id;
	String name;
	double price;
	
	Product(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	void display() {
		System.out.println("Product ID: "+id);
		System.out.println("Product Name: "+name);
		System.out.println("Product Price: "+price);
	}
}

class Electronics extends Product{
	int warranty;
	
	Electronics(int id, String name, double price, int warranty){
		super(id, name, price);
		this.warranty = warranty;
	}
	void displayElectronics() {
		display();
		System.out.println("Warranty: "+warranty+" Years");
	}
}

class Clothing extends Product{
	String size;
	
	Clothing(int id, String name, double price, String size){
	super(id, name, price);
	this.size = size;
	}
	void displayClothing() {
	display();
	System.out.println("Size: "+size);
	}
}

class Food extends Product{
	String expiryDate;
	Food(int id, String name, double price, String expiryDate){
		super(id, name, price);
		this.expiryDate = expiryDate;
	}
	void displayFood() {
	display();
	System.out.println("Expiry Date: "+expiryDate);
	}
}
public class OnlineShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose Product Category");
		System.out.println("1.Electronics");
		System.out.println("2.Clothing");
		System.out.println("3.Food");
		System.out.println("Enter Choice: ");
		int choice = sc.nextInt();
		
		System.out.println("Enter the Product ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the Product Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Product Price: ");
		double price = sc.nextDouble();
		sc.nextLine();
		
		if(choice == 1) {
			System.out.println("Enter Warranty (Years): ");
			int warranty = sc.nextInt();
			
			Electronics e = new Electronics(id, name, price, warranty);
			
			System.out.println("\n-----Electroincs Details-----");
			e.displayElectronics();
		}
		else if(choice == 2) {
			System.out.println("Enter the Size: ");
			String size = sc.nextLine();
			
			Clothing c = new Clothing(id, name, price, size);
			
			System.out.println("\n-----Clothing Details-----");
			c.displayClothing();
		}
		else if(choice == 3) {
			System.out.println("Enter the Expiry Date: ");
			String expiry = sc.nextLine();
			
			Food f = new Food(id, name, price, expiry);
			
			System.out.println("\n-----Expiry Date-----");
			f.displayFood();
		}
		else {
			System.out.println("Invalid Choic");
		}
		sc.close();
	}

}
