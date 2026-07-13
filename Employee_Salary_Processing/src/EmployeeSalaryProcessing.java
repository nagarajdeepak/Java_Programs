import java.util.Scanner;
public class EmployeeSalaryProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number of Employees: ");
		int n = sc.nextInt();
		
		String[] empName = new String[n];
		double[][] salary = new double[n][4];
		// salary[][0] = Basic
		// salary[][1] = HRA
		// salary[][2] = DA
		// salary[][3] = Deduction
		
		double[] gross = new double[n];
		double[] net = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("\nEnter Employee Name: ");
			empName[i] = sc.next();
			
			System.out.print("Enter Basic Salary: ");
			salary[i][0] = sc.nextDouble();
			
			System.out.print("Enter HRA: ");
			salary[i][1] = sc.nextDouble();
			
			System.out.print("Enter DA: ");
			salary[i][2] = sc.nextDouble();
			
			System.out.print("Engter Deduction: ");
			salary[i][3] = sc.nextDouble();
			
			gross[i] = salary[i][0] + salary[i][1] + salary[i][2];
			net[i] = gross[i] - salary[i][3];
		}
		System.out.println("\nEmployee Salary Report");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Name", "Basic", "HRA", "DA", "Gross", "Deduct", "Net");
		
		for(int i=0; i<n; i++) {
			System.out.printf("%-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n",
					empName[i],
					salary[i][0],
					salary[i][1],
					salary[i][2],
					gross[i],
					salary[i][3],
					net[i]);
		}
		sc.close();
		}
}