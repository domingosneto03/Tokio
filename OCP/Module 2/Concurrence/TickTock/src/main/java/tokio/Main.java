package tokio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tick-Tock Challenge!");
        TickTock tickTock = new TickTock();
        MyThread myThread1 = new MyThread("Tick", tickTock);
        MyThread myThread2 = new MyThread("Tock", tickTock);
        try {
            myThread1.getThread().join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.exit(0);
    }
}