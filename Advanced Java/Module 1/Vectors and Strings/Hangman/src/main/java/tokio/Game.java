package tokio;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public int round;
    public int turn;

    public Game(int round, int turn) {
        this.round = round;
        this.turn = turn;
    }

    // hangedGuesser refere-se ao jogador que tenta descobrir a palavra, com risco de ser enforcado
    // hanger refere-se ao jogador que escolhe a palavra na tentativa de enforcar o outro jogador
    public void hangman(String word, Player hangedGuesser, Player hanger, int difficulty) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        int attempts = 7;
        String[] wordArray = new String[word.length()];
        for(int i=0; i<wordArray.length; i++) wordArray[i] = "_";
        int spaceCount = word.length(); // numero de espacos livres

        hangDesign(attempts); // desenho da forca inicial
        wordDesign(wordArray); // desenho dos espaços da palavra no estado inicial

        while(attempts!=0 && spaceCount!=0) {
            System.out.println(hangedGuesser.getName() + " escolhe uma letra!");
            String choice = in.nextLine(); // lê o caracter
            while(choice.length()!=1) {
                System.out.println("Opção inválida! Só podes usar uma letra por jogada");
                choice = in.nextLine();
            }
            choice = choice.toUpperCase();

            if(!inputs.contains(choice)) {
                inputs.add(choice);
                boolean choiceCorrect = false;
                for(int i=0; i<word.length(); i++) {
                    if(choice.charAt(0)==word.charAt(i)) {
                        wordArray[i] = choice;
                        choiceCorrect = true;
                        spaceCount--;
                    }
                }
                if(!choiceCorrect) {
                    if(attempts==1) {
                        hangDesign(0);
                        wordDesign(wordArray);
                        attempts--;
                    }
                    else {
                        attempts--;
                        hangDesign(attempts);
                        wordDesign(wordArray);
                    }
                }
                else {
                    hangDesign(attempts);
                    wordDesign(wordArray);
                }
            }
            else {
                System.out.println("Já tentaste essa letra.");
                if(attempts==1) {
                    hangDesign(0);
                    wordDesign(wordArray);
                    attempts--;
                }
                else {
                    attempts--;
                    hangDesign(attempts);
                    wordDesign(wordArray);
                }
            }
        }

        if(attempts==0) {
            System.out.println(hangedGuesser.getName() + ", não descobriste a palavra. A resposta era " + word +
                    ".\n Portanto, " + hanger.getName() + " ganhou 5 pontos nesta ronda");
            System.out.println(); // linha livre
            hanger.setPoints(hanger.getPoints()+5);
        }
        else if(spaceCount==0) {
            System.out.println("Boa " + hangedGuesser.getName() + "! Como descobriste a palavra ganhaste " + (5*difficulty) + " pontos nesta ronda.");
            System.out.println(); // linha livre
            hangedGuesser.setDiscoveredWords(hangedGuesser.getDiscoveredWords()+1);
            hangedGuesser.setPoints(hangedGuesser.getPoints() + (5*difficulty)); // dependendo da dificuldade pode ganhar 5 10 ou 15 pontos
        }
    }

    private void wordDesign(String[] wordArray) {
        System.out.print("PALAVRA: ");
        for(String x : wordArray) System.out.print(x + " ");
        System.out.println(); System.out.println(); // linha livre

    }

    private void hangDesign(int attempts) {
        switch (attempts) {
            case 7:
                System.out.println("   ________");
                System.out.println("   |      |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("__________|");
                break;
            case 6:
                System.out.println("   ________");
                System.out.println("   |      |");
                System.out.println("   O      |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("__________|");
                break;
            case 5:
                System.out.println("   ________");
                System.out.println("   |      |");
                System.out.println("   O      |");
                System.out.println("   |      |");
                System.out.println("          |");
                System.out.println("          |");
                System.out.println("__________|");
                break;
            case 4:
                System.out.println("   ________");
                System.out.println("   |      |");
                System.out.println("   O      |");
                System.out.println("   |      |");
                System.out.println("   |      |");
                System.out.println("          |");
                System.out.println("__________|");
                break;
            case 3:
                System.out.println("   ________");
                System.out.println("   |      |");
                System.out.println("   O      |");
                System.out.println(" //|      |");
                System.out.println("   |      |");
                System.out.println("          |");
                System.out.println("__________|");
                break;
            case 2:
                System.out.println("   ________");
                System.out.println("   |      |");
                System.out.println("   O      |");
                System.out.println(" //|\\\\    |");
                System.out.println("   |      |");
                System.out.println("          |");
                System.out.println(" _________|");
                break;
            case 1:
                System.out.println("   ________");
                System.out.println("   |      |");
                System.out.println("   O      |");
                System.out.println(" //|\\\\    |");
                System.out.println("   |      |");
                System.out.println(" //       |");
                System.out.println(" _________|");
                break;
            case 0:
                System.out.println("   ________");
                System.out.println("   |      |");
                System.out.println("   O      |");
                System.out.println(" //|\\\\    |");
                System.out.println("   |      |");
                System.out.println(" // \\\\    |");
                System.out.println(" _________|");
                System.out.println("Unlucky! You're hanged!");
                break;
        }
    }

    public void pvpStats(Player player1, Player player2) {
        if(player1.getPoints()>player2.getPoints())
            System.out.println("---------- [" + player1.getName() + "] GANHOU A PARTIDA! ----------");
        else if(player1.getPoints()<player2.getPoints())
            System.out.println("---------- [" + player2.getName() + "] GANHOU A PARTIDA! ----------");
        else
            System.out.println("---------- EMPATE ----------");

        System.out.println(); // linha livre
        // Table headers
        System.out.println("+--------------+--------------------+--------+");
        System.out.println("|   Player     |  Discovered Words  | Points |");
        System.out.println("+--------------+--------------------+--------+");

        // Row for player 1
        System.out.printf("|   %-10s |          %-9d |   %-4d |\n", player1.getName(), player1.getDiscoveredWords(), player1.getPoints());

        // Row for player 2
        System.out.printf("|   %-10s |          %-9d |   %-4d |\n", player2.getName(), player2.getDiscoveredWords(), player2.getPoints());

        // Table footer
        System.out.println("+--------------+--------------------+--------+");
    }
}
