package org.example;

import java.util.Scanner;

public class Menu {
    public void mainMenu() {
        System.out.println("A sua encomenda encontra-se no valor de 69.99€" +
                "\nDeseja realizar o pagamento com:" +
                "\n\t (1) Cartão de Crédito" +
                "\n\t (2) PayPal");
        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1 -> {
                CartaoCredito cartao = new CartaoCredito();
                cartao.processarPagamento();
            }
            case 2 -> {
                PayPal paypal = new PayPal();
                paypal.processarPagamento();
            }
            default -> {
                System.out.println("Opção inválida.");
                System.exit(0);
            }
        }
        System.out.println("Pagamento realizado com sucesso! Obrigado!");
    }
}
