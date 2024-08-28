package tokio;

public class TickTock {
    private boolean ticked;
    public synchronized void tick(boolean running) {
        if(!running) {
            ticked = false;
            notify();
            return;
        }
        System.out.print("Tick ");
        ticked = true;
        notify();
        try {
            Thread.currentThread().sleep(500);
            while (ticked) {
                wait();
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public synchronized void tock(boolean running) {
        if(!running) {
            notify();
            System.exit(0);
        }
        System.out.println("Tock");
        ticked = false;
        notify();
        try {
            Thread.currentThread().sleep(500);
            while (!ticked) {
                wait();
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
