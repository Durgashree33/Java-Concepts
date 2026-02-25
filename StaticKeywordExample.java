class Student {

    String name;
    int rollNo;

    // Static variable 
    static String college = "ABC College";

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("College: " + college);
        System.out.println("-------------------");
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {

        Student s1 = new Student("Durga", 101);
        Student s2 = new Student("Anu", 102);

        System.out.println("Before changing college:");
        s1.display();
        s2.display();

        // Calling static method
        Student.changeCollege("XYZ University");

        System.out.println("After changing college:");
        s1.display();
        s2.display();
    }
}