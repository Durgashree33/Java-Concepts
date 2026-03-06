// Using Thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class is running");
    }
}

// Using Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface is running");
    }
}

public class ThreadExample {
    public static void main(String[] args) {

        // Thread class example
        MyThread t1 = new MyThread();
        t1.start();

        // Runnable interface example
        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t2.start();

        System.out.println("Main thread finished");
    }
}