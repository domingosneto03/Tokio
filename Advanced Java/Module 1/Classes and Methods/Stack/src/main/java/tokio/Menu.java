package tokio;

import java.util.Scanner;

public class Menu {
    Stack stack = new Stack(1);
    public void mainMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha uma das opções:" +
                "\n\t (1) Criar uma nova stack" +
                "\n\t (2) Adicionar um elemento a stack" +
                "\n\t (3) Retirar um elemento da stack" +
                "\n\t (4) Verificar o topo da stack" +
                "\n\t (5) Ver a stack completa" +
                "\n\t (6) Sair");

        int choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1 -> addStackMenu();
            case 2 -> pushStackMenu();
            case 3 -> stack.pop();
            case 4 -> stack.top();
            case 5 -> stack.seeStack();
            case 6 -> System.exit(0);
            default -> {
                System.out.println("Opção inválida. Tente novamente.");
                mainMenu();
            }
        }
    }

    private void pushStackMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolhe um valor");
        int value = Integer.parseInt(in.nextLine());
        stack.push(value);
    }

    private void addStackMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Primeiro define a capacidade da pilha");
        int capacity = Integer.parseInt(in.nextLine());
        stack = new Stack(capacity);
        System.out.println("Pilha com capacidade " + capacity + " criada.");
    }
}
