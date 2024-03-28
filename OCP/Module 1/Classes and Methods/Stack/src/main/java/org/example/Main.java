package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos aprender a usar a Stack.");
        System.out.println("Uma pilha (Stack) é uma estrutura de dados na qual o último elemento a entrar é o primeiro a sair " +
                "\n(exemplo: o último prato que se coloca na pilha do lava-louças é o primeiro a ser limpo)");
        Menu menu = new Menu();
        while(true) menu.mainMenu();
    }
}