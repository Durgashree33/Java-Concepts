import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(1, "Durga");
        students.put(2, "Anu");
        students.put(3, "Ravi");

        // Printing HashMap
        System.out.println("Students List: " + students);

        // Accessing value using key
        System.out.println("Student with ID 1: " + students.get(1));

        // Removing element
        students.remove(2);
        System.out.println("After Removing ID 2: " + students);

        // Looping through HashMap
        System.out.println("Student IDs:");
        for (Integer id : students.keySet()) {
            System.out.println(id);
        }
    }
}