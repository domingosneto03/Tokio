package tokio;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {
    private int max = 100;
    public synchronized void produce(List<String> list) {
        while(list.size() >= max) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int elem = list.size()+1;
        list.add("New");
        System.out.println("New product added");
        notifyAll();
    }
    public synchronized void consume(List<String> list, int element) {
        while(list.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        list.remove(element);
        System.out.println("Product" + (element+1) + " removed");
        notifyAll();
    }

}
