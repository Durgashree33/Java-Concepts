// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal (concrete) method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class 1
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        System.out.println("Dog Information:");
        a1.sound();
        a1.sleep();

        System.out.println("\nCat Information:");
        Animal a2 = new Cat();
        a2.sound();
        a2.sleep();
    }
}