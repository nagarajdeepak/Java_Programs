import java.util.Scanner;
public class LoginValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Enter Email ID: ");
		String email = sc.nextLine();
		
		System.out.println("Enter Password: ");
		String password = sc.nextLine();
		
		 if (email.contains("@gmail.com")) {

	            if (password.length() == 10 && password.matches("[0-9]+")) {
	                System.out.println("Login Successful");
	            } else {
	                System.out.println("Invalid Password!");
	                System.out.println("Password must be a 10-digit mobile number.");
	            }

	        } else {
	            System.out.println("Invalid Email!");
	            System.out.println("Email must contain @gmail.com");
	        }

	        sc.close();
	    }
	}