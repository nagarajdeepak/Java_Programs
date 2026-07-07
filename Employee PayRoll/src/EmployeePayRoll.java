import java.util.Scanner;
public class EmployeePayRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        // Employee Details
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        System.out.print("Enter Designation: ");
        String desig = sc.nextLine();

        System.out.print("Enter Years of Experience: ");
        int yoe = sc.nextInt();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

        // Net Salary Initial
        double netSalary = basicSalary;

        // BONUS Calculation
        if (dept.equalsIgnoreCase("HR")
                && desig.equalsIgnoreCase("Manager")) {

            netSalary = netSalary + 3000;

        }
        else if (dept.equalsIgnoreCase("HR")
                && desig.equalsIgnoreCase("Assistant Manager")) {

            netSalary = netSalary + 2000;

        }
        else if (dept.equalsIgnoreCase("IT")
                && desig.equalsIgnoreCase("Developer")) {

            netSalary = netSalary + 5000;

        }
        else if (dept.equalsIgnoreCase("IT")
                && desig.equalsIgnoreCase("Intern")) {

            netSalary = netSalary + 1000;

        }
        else {

            netSalary = netSalary + 500;

        }

        // INCREMENT Calculation
        if (desig.equalsIgnoreCase("Manager") && yoe >= 10) {

            netSalary = netSalary + 10000;

        }
        else if (desig.equalsIgnoreCase("Developer") && yoe >= 5) {

            netSalary = netSalary + 5000;

        }
        else if (desig.equalsIgnoreCase("Trainee") && yoe >= 2) {

            netSalary = netSalary + 2000;

        }
        else {

            netSalary = netSalary + 1000;

        }

        // Display
        System.out.println("\n===== EMPLOYEE PAYROLL =====");

        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Department    : " + dept);
        System.out.println("Designation   : " + desig);
        System.out.println("Experience    : " + yoe);

        System.out.println("Final Salary  : ₹" + netSalary);

        sc.close();
	}
}
