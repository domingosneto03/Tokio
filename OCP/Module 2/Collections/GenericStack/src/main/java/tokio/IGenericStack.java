package tokio;

public interface IGenericStack<T> {
    void pop();
    void push(T value);
    T top();
}
