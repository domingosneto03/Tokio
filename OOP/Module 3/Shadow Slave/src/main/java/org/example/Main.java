package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Shadow Slave Fight!");

        System.out.println("Player1: Escolha a sua personagem");
        Lutador player1 = escolherPlayer1(in);

        System.out.println("Player2: Escolha a sua personagem");
        Lutador player2 = escolherPlayer2(in);

        System.out.println("Preparem-se para a luta!");
        System.out.println("Player1: " + player1.getName() + " (Hp: " + player1.getHp() + "%)" + " ______vs______ Player2: " + player2.getName() + " (Hp: " + player2.getHp() + "%)");
        int rodada = 1;
        int obterVidaCount1 = 3; // Vezes que um jogador pode obter vida
        int obterVidaCount2 = 3;
        while(true) {
            System.out.println("Rodada:" + rodada);

            int jogadaPlayer1;
            int jogadaPlayer2;

            // Jogada do Player1
            System.out.println("Jogada de Player1");
            if(obterVidaCount1<=0) {
                jogadaPlayer1 = esgotado(in);
            }
            else {
                jogadaPlayer1 = escolherAcao(in);
            }

            // Jogada do Player2
            System.out.println("Jogada de Player2");
            if(obterVidaCount2<=0) {
                jogadaPlayer2 = esgotado(in);
            }
            else {
                jogadaPlayer2 = escolherAcao(in);
            }

            // Possíveis movimentos
            if(jogadaPlayer1==1 && jogadaPlayer2==1) {
                int hpRestante2 = player1.atacar(player2.getHp());
                int hpRestante1 = player2.atacar(player1.getHp());
                player1.setHp(hpRestante1);
                player2.setHp(hpRestante2);
                System.out.println("Ambos atacam");
            }
            else if(jogadaPlayer1==1 && jogadaPlayer2==2) {
                int hpRestante = player1.atacar(player2.getHp());
                player2.setHp(hpRestante);
                player2.defender();
                System.out.println("Player1 ataca e Player2 defende");
            }
            else if(jogadaPlayer1==1 && jogadaPlayer2==3) {
                int hpRestante = player1.atacar(player2.getHp());
                player2.setHp(hpRestante);
                player2.obterVida();
                obterVidaCount2--;
                System.out.println("Player1 ataca e Player2 regenera-se");
            }
            else if(jogadaPlayer1==2 && jogadaPlayer2==1) {
                int hpRestante = player2.atacar(player1.getHp());
                player1.setHp(hpRestante);
                player1.defender();
                System.out.println("Player1 defende e Player2 ataca");
            }
            else if(jogadaPlayer1==2 && jogadaPlayer2==2) {
                System.out.println("Ambos defendem-se");
            }
            else if(jogadaPlayer1==2 && jogadaPlayer2==3) {
                player2.obterVida();
                obterVidaCount2--;
                System.out.println("Player1 defende e Player2 regenera-se");
            }
            else if(jogadaPlayer1==3 && jogadaPlayer2==1) {
                int hpRestante = player2.atacar(player1.getHp());
                player1.setHp(hpRestante);
                player1.obterVida();
                obterVidaCount1--;
                System.out.println("Player1 regenera-se e Player2 ataca");
            }
            else if(jogadaPlayer1==3 && jogadaPlayer2==2) {
                player1.obterVida();
                obterVidaCount1--;
                System.out.println("Player1 regenera-se e Player2 defende");
            }
            else if(jogadaPlayer1==3 && jogadaPlayer2==3) {
                player1.obterVida();
                player2.obterVida();
                obterVidaCount1--;
                System.out.println("Ambos regeneram-se");
            }

            System.out.println("Player1: " + player1.getName() + " (Hp: " + player1.getHp() + "%)" + " ______vs______ Player2: " + player2.getName() + " (Hp: " + player2.getHp() + "%)");

            // Quando o Player1 ganha
            if(player2.getHp()<=0) {
                System.out.println("!!!!KO!!!!");
                System.out.println("PLAYER1: " + player1.getName() + " WINS!");
                System.exit(0);
            }

            // Quando o Player2 ganha
            else if(player1.getHp()<=0) {
                System.out.println("!!!!KO!!!!");
                System.out.println("PLAYER2: " + player2.getName() + " WINS!");
                System.exit(0);
            }

            // Em caso de empate
            else if(player1.getHp()<=0 && player2.getHp()<=0) {
                System.out.println("DRAW!!");
                System.exit(0);
            }
            else {
                rodada++;
            }
        }
    }

    // Método para escolher a personagem
    private static Lutador escolherPlayer1(Scanner scanner) {
        System.out.println("\t (1) Sunny" +
                "\n\t (2) Nephis" +
                "\n\t (3) Effie" +
                "\n\t (4) Jet" +
                "\n\t (5) Kai");

        int choicePlayer1 = Integer.parseInt(scanner.nextLine());
        switch (choicePlayer1) {
            case 1 -> {
                return new Sunny("Lost from Light, Ascended Sunless", 100, 27);
            }
            case 2 -> {
                return new Nephis("Changing Star, Ascended Nephis", 100, 25);
            }
            case 3 -> {
                return new Effie("Raised by Wolves, Ascended Athena", 100, 32);
            }
            case 4 -> {
                return new Jet("Soul Reaper, Ascended Jet", 100, 28);
            }
            case 5 -> {
                return new Kai("Nightingale, Ascended Kai", 100, 22);
            }
        }
        return null;
    }

    private static Lutador escolherPlayer2(Scanner scanner) {
        System.out.println("\t (1) Sunny" +
                "\n\t (2) Nephis" +
                "\n\t (3) Effie" +
                "\n\t (4) Jet" +
                "\n\t (5) Kai");

        int choicePlayer2 = Integer.parseInt(scanner.nextLine());
        switch (choicePlayer2) {
            case 1 -> {
                return new Sunny("Lost from Light, Ascended Sunless", 100, 27);
            }
            case 2 -> {
                return new Nephis("Changing Star, Ascended Nephis", 100, 25);
            }
            case 3 -> {
                return new Effie("Raised by Wolves, Ascended Athena", 100, 32);
            }
            case 4 -> {
                return new Jet("Soul Reaper, Ascended Jet", 100, 28);
            }
            case 5 -> {
                return new Kai("Nightingale, Ascended Kai", 100, 22);
            }
        }
        return null;
    }

    // Método para selecionar o movimento a fazer
    private static int escolherAcao(Scanner scanner) {
        System.out.println("\t (1) Atacar" +
                "\n\t (2) Defender" +
                "\n\t (3) Obter vida");
        return Integer.parseInt(scanner.nextLine());
    }

    // Metodo para selecionar o movimento quando o jogador esgotou as regenerações
    private static int esgotado(Scanner scanner) {
        System.out.println("\t (1) Atacar" +
                "\n\t (2) Defender");
        return Integer.parseInt(scanner.nextLine());
    }
}