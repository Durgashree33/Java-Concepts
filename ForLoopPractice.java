public class ForLoopPractice {
    public static void main(String[] args) {

        // Print numbers from 1 to 20
        System.out.println("Numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }

        // Even numbers
        System.out.println("\n\nEven Numbers from 1 to 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        // Multiplication Table of 5
        System.out.println("\n\nMultiplication Table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // Star Pattern
        System.out.println("\nStar Pattern:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}