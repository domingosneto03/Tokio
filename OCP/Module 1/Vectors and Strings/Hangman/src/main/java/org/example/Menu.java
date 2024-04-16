package org.example;
import java.text.Normalizer;
import java.util.Scanner;

public class Menu {
    public void mainMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolhe uma das opções" +
                "\n\t (1) Player vs Player" +
                "\n\t (2) Player vs Computer" +
                "\n\t (3) Sair");
        int choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1 -> pvpMenu();
            case 2 -> pvcMenu();
            case 3 -> System.exit(0);
            default -> {
                System.out.println("Opção inválida. Tente novamente");
                mainMenu();
            }
        }
    }

    private void pvcMenu() {
        System.out.println("Brevemente...");
        System.out.println();
        mainMenu();
    }

    private void pvpMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("---------- BEM-VINDO AO MODO PvP ----------");
        System.out.println(); // linha livre

        System.out.println("Escreva o nome para o player1:");
        String namePlayer1 = in.nextLine();
        Player player1 = new Player(namePlayer1, 0, 0);
        System.out.println("PLAYER1: [" + namePlayer1 + "]");
        System.out.println(); // linha livre

        System.out.println("Escreva o nome para o player2:");
        String namePlayer2 = in.nextLine();
        Player player2 = new Player(namePlayer2, 0, 0);
        System.out.println("PLAYER2: [" + namePlayer2 + "]");
        System.out.println(); // linha livre

        int roundNumber = chooseRoundsMenu(); // escolher o numero de rondas para jogar.

        Game game = new Game(1,1);
        while(game.round<=roundNumber) {
            if(game.turn==1) {
                System.out.println("---------- RONDA " + game.round + ": [" + player1.getName() + "] TENTA DESCOBRIR A PALAVRA ----------");
                System.out.println(); // linha livre
                int[] wordBound = pickDifficultyMenu(player1);
                String pickedWord = pickWordMenu(player2, player1, wordBound[0], wordBound[1]);
                for(int i=0; i<=100; i++) System.out.println(); // linhas livres para não se ver a palavra selecionada
                game.hangman(pickedWord, player1, player2, wordBound[2]);
                game.round++;
                game.turn = 2; // troca de vez para adivinhar
            }
            else {
                System.out.println("---------- RONDA " + game.round + ": [" + player2.getName() + "] TENTA DESCOBRIR A PALAVRA ----------");
                System.out.println(); // linha livre
                int[] wordBound = pickDifficultyMenu(player2);
                String pickedWord = pickWordMenu(player1, player2, wordBound[0], wordBound[1]);
                for(int i=0; i<=100; i++) System.out.println(); // linhas livres para não se ver a palavra selecionada
                game.hangman(pickedWord, player2, player1, wordBound[2]);
                game.round++;
                game.turn = 1; // troca de vez para adivinhar
            }
        }
        game.pvpStats(player1, player2);
    }

    private int chooseRoundsMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escolhe o número de rondas que desejas jogar!" +
                "\t\n (1) Jogar 2 rondas" +
                "\t\n (2) Jogar 4 rondas" +
                "\t\n (3) Jogar 6 rondas");
        int choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 6;
            default:
                System.out.println("Opção inválida. Tenta novamente");
                chooseRoundsMenu();
                break;
        }
        return -1;
    }

    private String pickWordMenu(Player hanger, Player hangedGuesser, int min, int max) {
        Scanner in = new Scanner(System.in);
        if(min!=10) System.out.println("[" + hanger.getName() +"] escolhe a tua palavra. Se [" + hangedGuesser.getName() + "] não descobrir a palavra, ganhas 5 pontos. A tua escolha tem de ter entre " + min + " e " + max + " letras.");
        else System.out.println("Player2 escolhe a tua palavra. Se o Player1 não descobrir a palavra, ganhas 5 pontos. A tua escolha tem de ter no mínimo " + min + " letras.");

        while(true) {
            String pickedWord = in.nextLine();
            if(pickedWord.length()<min || pickedWord.length()>max) {
                System.out.println("Palavra inválida. Tens de obedecer os parâmetros da dificuldade atribuída." +
                        "\nTenta novamente.");
            }
            else if(!isWordValid(pickedWord)) {
                System.out.println("Palavra inválida. Só podes escrever uma palavra e não se aceitam letras com símbolos." +
                        "\nTenta novamente");
            }
            else {
                pickedWord = normalizeString(pickedWord);
                return pickedWord;
            }
        }
    }

    private String normalizeString(String pickedWord) {
        // Remove acentuação e caracteres especiais, mantendo apenas letras e o caractere 'ç'
        String normalizedString = Normalizer.normalize(pickedWord, Normalizer.Form.NFD);
        normalizedString = normalizedString.replaceAll("[^\\p{ASCII}]", "");
        normalizedString = normalizedString.toUpperCase();
        return normalizedString;
    }

    private boolean isWordValid(String word) {
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i)==' ' || word.charAt(i)=='\u00a7' || word.charAt(i)=='\u2021') return false;
        }
        return true;
    }

    private int[] pickDifficultyMenu(Player hangedGuesser) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[3]; // [min, max, difficulty]
        System.out.println("[" + hangedGuesser.getName() + "] escolhe a dificuldade da palavra que terás de adivinhar." +
                "\nLeva em conta que descobrires uma palavra com maior dificuldade resulta em mais pontos");
        System.out.println("\t (1) Fácil (entre 3 a 5 letras)" +
                "\n\t (2) Médio (entre 6 a 9 letras)" +
                "\n\t (3) Difícil (10 ou mais letras)");

        int choice = Integer.parseInt(in.nextLine());
        switch (choice) {
            case 1 -> {
                array[0] = 3;
                array[1] = 5;
                array[2] = 1; // dificuldade facil
                System.out.println("---------- DIFICULDADE: FACIL ----------");
                System.out.println(); // linha livre
            }
            case 2 -> {
                array[0] = 6;
                array[1] = 9;
                array[2] = 2; // dificuldade media
                System.out.println("---------- DIFICULDADE: MEDIA ----------");
                System.out.println(); // linha livre
            }
            case 3 -> {
                array[0] = 10;
                array[1] = 100;
                array[2] = 3; // dificuldade dificil
                System.out.println("---------- DIFICULDADE: DIFICIL ----------");
                System.out.println(); // linha livre
            }
        }
        return array;
    }
}
