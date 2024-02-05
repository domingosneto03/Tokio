package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo, Coordenador!");
        Menu menu = new Menu();
        while(true) {
            menu.mainMenu(); //programa continua até o utilizador desejar o contrário
        }
    }
}