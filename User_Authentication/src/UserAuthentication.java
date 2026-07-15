import java.util.Scanner;

class Authentication {

    void login(String email, String password) {
        if (email.endsWith("@gmail.com") && password.matches("\\d{10}")) {
            System.out.println("Login Successful using Email and Password");
        } else {
            System.out.println("Invalid Email or Password");
            System.out.println("Email must end with @gmail.com");
            System.out.println("Password must contain exactly 10 digits");
        }
    }

    void login(long phone, int otp) {
        if (String.valueOf(phone).length() == 10 &&
            String.valueOf(otp).length() == 6) {

            System.out.println("Login Successful using Phone Number and OTP");
        } else {
            System.out.println("Invalid Phone Number or OTP");
            System.out.println("Phone number must contain exactly 10 digits");
            System.out.println("OTP must contain exactly 6 digits");
        }
    }

    void login(String socialId) {
        if (socialId.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@#$%^&+=!]).+$")) {
            System.out.println("Login Successful using Social ID");
        } else {
            System.out.println("Invalid Social ID");
            System.out.println("Social ID must contain:");
            System.out.println("- At least one letter");
            System.out.println("- At least one number");
            System.out.println("- At least one special character");
        }
    }
}

public class UserAuthentication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Authentication auth = new Authentication();

        System.out.println("===== User Authentication =====");
        System.out.println("1. Email & Password");
        System.out.println("2. Phone & OTP");
        System.out.println("3. Social ID");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            auth.login(email, password);   // Method call

        } else if (choice == 2) {

            System.out.print("Enter Phone Number: ");
            long phone = sc.nextLong();

            System.out.print("Enter OTP: ");
            int otp = sc.nextInt();

            auth.login(phone, otp);        // Method call

        } else if (choice == 3) {

            sc.nextLine();

            System.out.print("Enter Social ID: ");
            String socialId = sc.nextLine();

            auth.login(socialId);          // Method call

        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}