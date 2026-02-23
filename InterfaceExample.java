// Creating an interface
interface Animal {
    void sound();

    void eat();
}

// Implementing the interface
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a1.eat();

        System.out.println("----------");

        a2.sound();
        a2.eat();
    }
}