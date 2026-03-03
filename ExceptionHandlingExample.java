// Custom Exception Class
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {

    // Method using throws keyword
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Valid age for voting.");
        }
    }

    public static void main(String[] args) {

        // try-catch example
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        // Multiple catch example
        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index.");
        } catch (Exception e) {
            System.out.println("General Exception occurred.");
        }

        // finally block
        finally {
            System.out.println("Finally block executed.");
        }

        // throw and throws with custom exception
        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }
    }
}