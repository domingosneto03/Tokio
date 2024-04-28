package tokio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Producer-Consumer Problem!");
        SharedResource sharedResource = new SharedResource();
        int number = 2;
        for(int i=0; i<number; i++){
            ProducerConsumer producerConsumer = new ProducerConsumer(sharedResource);
            new Thread(producerConsumer).start();
        }
    }
}