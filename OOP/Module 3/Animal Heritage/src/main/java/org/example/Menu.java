package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    ArrayList<Animal> animais = new ArrayList<Animal>();

    public void mainMenu() {
        System.out.println("Escolha uma das opções:" +
                "\n\t (1) Criar um animal" +
                "\n\t (2) Lista de animais criados" +
                "\n\t (3) Sair");

        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1 -> criarMenu();
            case 2 -> listaAnimais();
            case 3 -> System.exit(0);
            default -> {
                System.out.println("Opção inválida. Tente novamente.");
                mainMenu();
            }
        }
    }

    // Menu para criar um animal
    private void criarMenu() {
        System.out.println("Que tipo de animal desejas criar?" +
                "\n\t (1) Cão" +
                "\n\t (2) Gato" +
                "\n\t (3) Voltar para o menu principal");

        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1 -> cao();
            case 2 -> gato();
            case 3 -> mainMenu();
            default -> {
                System.out.println("Opção inválida. Tente novamente.");
                criarMenu();
            }
        }
    }

    // Metodo para o utilizador criar uma instancia de um cão
    private void cao() {
        System.out.println("Boa escolha! Que nome queres dar ao teu novo cão?");
        Scanner in = new Scanner(System.in);
        String optionName = in.nextLine();
        Cao cao = new Cao(optionName);
        animais.add(cao);
        System.out.println("[" + optionName + "] foi adicionado com sucesso à tua lista de animais! Queres brincar com ele?");
        brincarCaoMenu(cao);
    }

    // Menu que recebe o objeto e apresenta a possibilidade de varios metodos
    private void brincarCaoMenu(Cao cao) {
        System.out.println("Testa o que " + cao.nome + " consegue fazer!" +
                "\n\t (1) Emitir um som" +
                "\n\t (2) Ladrar" +
                "\n\t (3) Miar" +
                "\n\t (4) Voltar para o menu principal");

        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        if(choice == 1)
            cao.emitirSom();
        else if (choice == 2)
            cao.ladrar();
        else if(choice == 3)
            System.out.println("Um cão não consegue miar.");
        else if(choice == 4)
            mainMenu();
        else {
            System.out.println("Opção inválida. Tente novamente.");
            brincarCaoMenu(cao);
        }
        mainMenu();
    }

    // Metodo para o utilizador criar uma instancia de um gato
    private void gato() {
        System.out.println("Boa escolha! Que nome queres dar ao teu novo gato?");
        Scanner in = new Scanner(System.in);
        String optionName = in.nextLine();
        Gato gato = new Gato(optionName);
        animais.add(gato);
        System.out.println(optionName + " foi adicionado com sucesso à tua lista de animais! Queres brincar com ele?");
        brincarGatoMenu(gato);
    }

    // Menu que recebe o objeto e apresenta a possibilidade de varios metodos
    private void brincarGatoMenu(Gato gato) {
        System.out.println("Testa o que " + gato.nome + " consegue fazer!" +
                "\n\t (1) Emitir um som" +
                "\n\t (2) Ladrar" +
                "\n\t (3) Miar" +
                "\n\t (4) Voltar para o menu principal");
        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1 -> gato.emitirSom();
            case 2 -> System.out.println("Um gato não consegue ladrar.");
            case 3 -> gato.miar();
            case 4 -> mainMenu();
            default -> {
                System.out.println("Opção inválida. Tente novamente.");
                brincarGatoMenu(gato);
            }
        }
        mainMenu();
    }

    // Lista completa de animais do utilizador
    public void listaAnimais() {
        if(animais.isEmpty()) {
            System.out.println("Parece que não tens nenhum animal na tua lista. Cria um novo para poderes brincar com ele!");
            mainMenu();
        }
        int i = 1;
        System.out.println("Lista dos teus animais");
        for(Animal x : animais) {
            System.out.println("\t (" + i + ") " + x.nome);
            i++;
        }
        System.out.println("Escolhe um animal da tua lista para brincares com ele ('0' se desejares voltar para o menu principal");
        Scanner in = new Scanner(System.in);
        int choice = Integer.parseInt(in.nextLine());
        // Dependendo das opções que aparece na lista, brincar com o animal criado
        if(choice==0)
            mainMenu();
        else {
            Animal animal = animais.get(choice-1);
            if(animal instanceof Cao)
                brincarCaoMenu((Cao) animal);
            else
                brincarGatoMenu((Gato) animal);
        }
    }
}
