package tokio;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> implements IGenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        this.stack = new ArrayList<>();
    }

    @Override
    public void pop() {
        if(!stack.isEmpty()) {
            System.out.println("-> value removed");
            stack.remove(stack.size()-1);
        }
    }

    @Override
    public void push(T value) {
        System.out.println("-> value inserted");
        stack.add(value);
    }

    @Override
    public T top() {
        if(!stack.isEmpty()) return stack.get(stack.size()-1);
        return null;
    }

    @Override
    public String toString() {
        return "GenericStack{" +
                "stack=" + stack +
                '}';
    }
}
