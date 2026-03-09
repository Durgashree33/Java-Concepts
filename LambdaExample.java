interface Greeting {
    void sayHello();
}

public class LambdaExample {
    public static void main(String[] args) {

        // Without Lambda (Old way)
        Greeting g1 = new Greeting() {
            public void sayHello() {
                System.out.println("Hello (Without Lambda)");
            }
        };
        g1.sayHello();

        // With Lambda (Java 8)
        Greeting g2 = () -> {
            System.out.println("Hello (With Lambda)");
        };
        g2.sayHello();
    }
}