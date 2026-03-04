import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Printing ArrayList
        System.out.println("Fruits List: " + fruits);

        // Accessing element
        System.out.println("First Fruit: " + fruits.get(0));

        // Removing element
        fruits.remove("Banana");
        System.out.println("After Removing Banana: " + fruits);

        // Looping through ArrayList
        System.out.println("Using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
