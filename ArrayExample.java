public class ArrayExample {
    public static void main(String[] args) {

        //1D Array
        int[] numbers = {5, 2, 9, 1, 7};

        System.out.println("Original Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        //Searching (Linear Search)
        int key = 9;
        boolean found = false;

        for (int num : numbers) {
            if (num == key) {
                found = true;
                break;
            }
        }

        System.out.println("\n\nSearching for " + key + ": " + (found ? "Found" : "Not Found"));

        //Sorting (Bubble Sort)
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted Array (Bubble Sort):");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        //2D Array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n\n2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}