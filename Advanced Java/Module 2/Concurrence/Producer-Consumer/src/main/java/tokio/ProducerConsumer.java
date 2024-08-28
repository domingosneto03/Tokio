package tokio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConsumer implements Runnable {
    private SharedResource sharedResource;

    public ProducerConsumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        Random r = new Random();
        int size = r.nextInt(10) + 90;
        List<String> products = new ArrayList<>();
        for(int i=0; i<size; i++) {
            int elem = i+1;
            products.add("Product" + elem);
        }
        int count = 10;
        while(count!=0) {
            sharedResource.produce(products);
            sharedResource.consume(products, r.nextInt(50));
            count--;
        }

    }
}
