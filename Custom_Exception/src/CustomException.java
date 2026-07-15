// Custom Exception Class
class InvalidAgeException extends Exception {

    // Constructor
    InvalidAgeException(String message) {
        super(message);
    }
}

// Main Class
public class CustomException{

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);   // Change this value to test
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}