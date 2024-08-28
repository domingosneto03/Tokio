package tokio;

public class Stack {
    private int capacity;
    private int[] stack;
    private int top; // Indice do topo da stack

    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1; // inicialmente vazia.
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == capacity-1);
    }

    public void push(int number) {
        if(!isFull()) {
            top++;
            stack[top] = number;
            System.out.println("O valor " + number + " foi adicionado à pilha");
        }
        else System.out.println("A pilha está cheia. Não podes adicionar mais elementos.");
    }

    public void pop() {
        if(!isEmpty()) {
            System.out.println("O valor retirado da pilha é: " + stack[top]);
            top--;
        }
        else System.out.println("A pilha está vazia. Não podes retirar elementos.");
    }

    public void top() {
        if(!isEmpty()) System.out.println("O valor que está no topo da pilha é: " + stack[top]);
        else System.out.println("A pilha está vazia.");
    }

    public void seeStack() {
        if(!isEmpty()) {
            System.out.print("[");
            for(int i=0; i<=top; i++) {
                if(i!=top) System.out.print(stack[i] + ",");
                else System.out.println(stack[i] + "]");
            }
        }
        else System.out.println("A pilha está vazia.");
    }
}
