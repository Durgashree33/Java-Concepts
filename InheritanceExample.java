class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    // override
    void eat() {
        System.out.println("Dog eats meat.");
    }

    void bark() {
        System.out.println("Dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal a = new Dog();  
        a.eat();
    }
}