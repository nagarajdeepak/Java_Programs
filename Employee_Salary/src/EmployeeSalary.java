import java.util.Scanner;

class Employee{
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	void displayEmployee() {
		System.out.println("\nEmployee Details");
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+name);
	}
}

class Salary extends Employee{
	double basicSalary;
	double hra;
	double da;
	double grossSalary;
	
	Salary(int id, String name, double basicSalary){
		super(id, name);
		this.basicSalary = basicSalary;
	}
	void calculateSalary() {
		if(basicSalary <=0) {
			System.out.println("Invalid Salary");
		} else {
			hra = basicSalary * 0.20;
			da = basicSalary * 0.10;
			grossSalary = basicSalary + hra +da;
			
			displayEmployee();
			System.out.println("Basic Salary: Rs "+basicSalary);
			System.out.println("HRA (20%): Rs "+hra);
			System.out.println("DA (10%): Rs "+da);
			System.out.println("Gross Salary: Rs "+grossSalary);
		}
	}
}
public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Baisc Salary: ");
		double salary = sc.nextDouble();
		
		Salary emp = new Salary(id, name, salary);
		emp.calculateSalary();
		
		sc.close();
	}

}
