package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    ArrayList<ContaBancaria> conta = new ArrayList<>(); // lista com apenas uma conta bancaria

    // metodo que gera um número aleatorio com 9 digitos para fazer de numero de conta
    private long numeroContaAleatorio() {
        Random random = new Random();
        return 100_000_000L + random.nextInt(900_000_000);
    }

    public void mainMenu() {
        System.out.println("Escolha uma das operações" +
                "\n\t (1) Informação da conta" +
                "\n\t (2) Abrir uma conta" +
                "\n\t (3) Movimentos" +
                "\n\t (4) Sair");

        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1 -> infoMenu();
            case 2 -> abrirContaMenu();
            case 3 -> movimentosMenu();
            case 4 -> System.exit(0);
            default -> {
                System.out.println("Opção inválida. Tente novamente.");
                mainMenu();
            }
        }

    }

    // apresenta os métodos de levantar e depositar dinheiro e verificar saldo
    private void movimentosMenu() {
        if (conta.isEmpty()) {
            System.out.println("Ainda não tens conta. Abre uma nova, insere a tua informação pessoal e faz a tua primeira transação!");
            mainMenu();
        } else {
            System.out.println("Que movimento deseja realizar?" +
                    "\n\t (1) Levantar dinheiro" +
                    "\n\t (2) Depositar dinheiro" +
                    "\n\t (3) Verificar saldo" +
                    "\n\t (4) Voltar para o menu principal");

            Scanner in = new Scanner(System.in);
            int choice = Integer.parseInt(in.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("Quanto dinheiro queres levantar? (notas de 10€, 20€, 50€)");
                    double quantidade = Double.parseDouble(in.nextLine());

                    // verifica se a quantidade solicitada é superior ou não ao saldo disponivel
                    if (conta.get(0).getSaldo() < quantidade) {
                        System.out.println("Não tens saldo suficiente para levantar essa quantia. Tente outro valor.");
                        movimentosMenu();
                    }
                    // verifica se a quantia é possível ser levantada com as notas suportadas pela máquina
                    else if (quantidade % 10 != 0) {
                        System.out.println("A máquina não suporta essa quantia para levantamento.");
                        movimentosMenu();
                    }
                    else {
                        conta.get(0).levantar(quantidade);
                        mainMenu();
                    }
                }
                case 2 -> {
                    System.out.println("Quanto dinheiro queres depositar? (notas de 10€, 20€, 50€)");
                    double quantidade = Double.parseDouble(in.nextLine());

                    // verifica se a quantia é possível ser depositada com as notas suportadas pela máquina
                    if (quantidade % 10 != 0) {
                        System.out.println("A máquina não suporta essa quantia para depósito.");
                        movimentosMenu();
                    }
                    else {
                        conta.get(0).depositar(quantidade);
                        mainMenu();
                    }
                }
                case 3 -> {
                    conta.get(0).verificarSaldo();
                    mainMenu();
                }
                case 4 -> mainMenu();
                default -> {
                    System.out.println("Opção inválida. Tente novamente.");
                    movimentosMenu();
                }
            }
        }
    }

    private void abrirContaMenu() {
        // não aceita a criação de mais que uma conta
        if (!conta.isEmpty()) {
            System.out.println("Lamentamos mas ainda não existe a possibilidade de ter múltiplas contas");
            mainMenu();
        }
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String name = in.nextLine();

        // abre uma conta com um numero de conta gerado, o nome de titular escolhido, e um saldo inicial de 0€
        ContaBancaria contaNova = new ContaBancaria(numeroContaAleatorio(), name, 0);
        conta.add(contaNova);

        System.out.println("Conta criada com sucesso! Realiza a tua primeira transação!");
        mainMenu();

    }

    // apresenta a informação da conta
    private void infoMenu() {
        if (conta.isEmpty()) {
            System.out.println("Ainda não tens conta. Abre uma nova, insere a tua informação pessoal e faz a tua primeira transação!");
            mainMenu();
        } else {
            System.out.println("Informação de conta:" +
                    "\n\t Número de conta: " + conta.get(0).getNumeroConta() +
                    "\n\t Nome do Títular: " + conta.get(0).getTitular() +
                    "\n\t Saldo atual: " + conta.get(0).getSaldo() + "€");
            mainMenu();
        }
    }
}
