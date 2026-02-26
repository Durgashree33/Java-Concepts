// Final class (cannot be extended)
final class Vehicle {
    void display() {
        System.out.println("This is a vehicle");
    }
}

class Car {

    // Final variable (constant)
    final int speedLimit = 120;

    // Final method (cannot be overridden)
    final void showSpeedLimit() {
        System.out.println("Speed Limit: " + speedLimit);
    }
}

class SportsCar extends Car {

    // Uncommenting below method will cause error
    /*
     * void showSpeedLimit() {
     * System.out.println("Overriding not allowed");
     * }
     */

    void showDetails() {
        System.out.println("This is a sports car");
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {

        Car car = new Car();
        car.showSpeedLimit();

        SportsCar sc = new SportsCar();
        sc.showDetails();
        sc.showSpeedLimit();

        Vehicle v = new Vehicle();
        v.display();

        // Uncommenting below line will cause error
        // class Bike extends Vehicle {} // Cannot inherit from final class
    }
}