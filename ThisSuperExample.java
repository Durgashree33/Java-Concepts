class Person {
    String name;

    // Parent class constructor
    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo;

    // Child class constructor
    Student(String name, int rollNo) {
        super(name); // Calls parent constructor
        this.rollNo = rollNo; // Refers to current class variable
        System.out.println("Student constructor called");
    }

    void showDetails() {
        this.display(); // Calls parent method using this reference
        System.out.println("Roll No: " + rollNo);
    }
}

public class ThisSuperExample {
    public static void main(String[] args) {

        Student s1 = new Student("Durga", 18);
        System.out.println("Student Information:");
        s1.showDetails();
    }
}
