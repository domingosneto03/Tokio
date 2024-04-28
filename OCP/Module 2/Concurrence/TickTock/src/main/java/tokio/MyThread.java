package tokio;

public class MyThread implements Runnable{
    private Thread thread;
    private TickTock tt;

    public MyThread(String name, TickTock tt) {
        this.thread = new Thread(this, name);
        this.tt = tt;
        thread.start();
    }

    @Override
    public void run() {
        if(thread.getName().equals("Tick")) {
            for(int i=0; i<10; i++) {
                tt.tick(true);
            }
            tt.tick(false);
        }
        else {
            for(int i=0; i<10; i++) {
                tt.tock(true);
            }
            tt.tock(false);
        }
    }

    public Thread getThread() {
        return thread;
    }
}
