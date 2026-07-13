import java.util.Scanner;
public class RentHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean isTrue=true;
		while(isTrue) {
			System.out.println("Select House Type : ");
			System.out.println("1 BHK -------------> Press'1'");
			System.out.println("2 BHK -------------> Press'2'");
			System.out.println("3 BHK -------------> Press'3'");
			System.out.println("Villa -------------> Press'4'");
			System.out.println("Exit  -------------> Press'0'");

			int choice=sc.nextInt();
			switch(choice){
			case 1:float rent1bhk=9000; 
			rentReceipt(sc,rent1bhk,"1 BHK");
			break;
			case 2: float rent2bhk=12000;
			rentReceipt(sc,rent2bhk,"2 BHK");
			break;
			case 3: float rent3bhk=18000;
			rentReceipt(sc,rent3bhk,"3 BHK");
			break;
			case 4: float villa =25000;
			rentReceipt(sc,villa,"Villa");
			break;
			case 0: System.out.println("Thank you");
			isTrue=false;
			break;
			default: System.out.println("Invalid Selection\n");
			break;
			}
			if(!isTrue) {
				break;
			}
		}
		sc.close();
	}

	static void rentReceipt(Scanner scan,float rent,String type) {
		System.out.print("\nEnter Number of Months : ");
		int months=scan.nextInt();
		if (months <= 0) {
			System.out.println("Months must be greater than 0.");
			return;
		}

		System.out.print("Enter Electricity Bill : ");
		float electricityBill = scan.nextFloat();

		if (electricityBill < 0) {
			System.out.println("Electricity bill cannot be negative.");
			return;
		}

		System.out.print("Enter Water Bill : ");
		float waterBill = scan.nextFloat();

		if (waterBill < 0) {
			System.out.println("Water bill cannot be negative.");
			return;
		}

		System.out.print("Enter Maintenance Charges : ");
		float maintenanceCharge = scan.nextFloat();

		if (maintenanceCharge < 0) {
			System.out.println("Maintenance charge cannot be negative.");
			return;
		}
		float totalBill=(rent*months)+electricityBill+waterBill+maintenanceCharge;

		System.out.println("===============Rent Receipt================\n");
		System.out.println("House Type              : "+type);
		System.out.println("Monthly Rent            : "+rent);
		System.out.println("Months                  : "+months);
		System.out.println("House Rent              : "+(rent*months));
		System.out.println("Electricity Bill        : "+electricityBill);
		System.out.println("Water Bill              : "+waterBill);
		System.out.println("Maintenance Charges     : "+maintenanceCharge);
		System.out.println("-------------------------------------------------");
		System.out.println("Total Bill              : "+totalBill);
		System.out.println("-------------------------------------------------\n");
	}

}
