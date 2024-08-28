package tokio;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("João", 183750394, 1457.51);
        Conta conta2 = new Conta("Carlos", 194830209, 431.99);

        System.out.println("O " + conta1.getTitular() + " tem " + conta1.getQuantidade() + "€ na sua conta.");
        System.out.println("O " + conta2.getTitular() + " tem " + conta2.getQuantidade() + "€ na sua conta.");

        if(conta1.getQuantidade() > conta2.getQuantidade())
            System.out.println("O " + conta1.getTitular() + " tem mais dinheiro que o " + conta2.getTitular());
        else
            System.out.println("O " + conta2.getTitular() + " tem mais dinheiro que o " + conta1.getTitular());
    }
}