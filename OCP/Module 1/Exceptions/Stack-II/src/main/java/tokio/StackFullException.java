package tokio;

public class StackFullException extends Exception {
    public StackFullException(String msg) {
        super(msg);
    }
}
