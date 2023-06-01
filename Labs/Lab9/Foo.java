package Labs.Lab9;

public class Foo implements Runnable {
    private String message;

    public Foo(String message) {
        this.message = message;
    }

    public void run() {
        System.out.println("Thread " + message + " is executing.");

        int result = 2 + 2;
        System.out.println("Result of the calculation in thread " + message + ": " + result);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Foo("Thread 1"));
        Thread t2 = new Thread(new Foo("Thread 2"));

        t1.start();
        t2.start();
    }
}