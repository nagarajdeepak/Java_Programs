import java.util.Scanner; 
public class ElectriityBillMonths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double units, bill, totalBill = 0;
		
		for(int month=1; month<=6; month++) {
			System.out.println("Months "+month);
			System.out.println("Enter Units Consumed: ");
			units = sc.nextDouble();
			
			if(units<=100) {
				bill = units*2.0;
			} else if (units<=200) {
				bill = (100*2.0)+((units-100)*3.5);
			} else {
				bill = (100*2.0)+(100*3.5)+((units-200)*5.0);
			}
			System.out.println("Electricity Bill for Month "+month+"= Rs."+bill);
			totalBill+= bill;
			System.out.println();
		}
		System.out.println("Total Electricity Bill for 6 Months= Rs."+totalBill);
		
		sc.close();
	}
}