package tokio;

public class Main {
    public static void main(String[] args) {
        System.out.println("GenericStack!");
        System.out.println();

        GenericStack<String> sStack = new GenericStack<>();
        sStack.push("Sunny");
        sStack.toString();
        sStack.push("Nephis");
        sStack.push("Cassie");
        System.out.println(sStack.toString());
        System.out.println("Top of the stack: " + sStack.top());
        sStack.pop();
        System.out.println(sStack.toString());
        sStack.pop();
        System.out.println(sStack.toString());
        System.out.println("Top of the stack: " + sStack.top());

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        GenericStack<Integer> iStack = new GenericStack<>();
        iStack.push(2);
        iStack.push(2);
        iStack.push(3);
        iStack.push(5);
        System.out.println(iStack.toString());
        iStack.pop();
        iStack.pop();
        System.out.println(iStack.toString());
        iStack.push(7);
        System.out.println(iStack.toString());
        System.out.println("Top of the stack: " + iStack.top());
    }
}