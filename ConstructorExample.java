class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Savitha";
        age = 19;
        System.out.println("Default Constructor Called");
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("-----------");
    }
}

public class ConstructorExample {
    public static void main(String[] args) {

        // Calling default constructor
        Student s1 = new Student();
        s1.display();

        // Calling parameterized constructor
        Student s2 = new Student("Durga", 20);
        s2.display();
    }
}