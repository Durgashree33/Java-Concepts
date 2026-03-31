public class DiamondProgram {
    public static void main(String[] args) {
        int n = 5; // number of rows (half diamond)

        // Upper part
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            // spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
