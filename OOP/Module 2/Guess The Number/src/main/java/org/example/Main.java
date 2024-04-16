package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int bound = 101;
        int rand = random.nextInt(bound);

        Game game = new Game();

        System.out.println("Let's play Guess the Number!!");
        Scanner in = new Scanner(System.in);
        System.out.println("You have 7 attempts to guess the number between 0 and 100. Pick a number!");
        int attempts = 7;
        int choice = in.nextInt();
        while(attempts>1) {
            if(game.didGuess(rand, choice)) {
                System.out.println("Wow you have won the game with " + attempts + " attempts left!!");
                return;
            } else {
                attempts--;
                System.out.println("Pick another number! You have " + attempts + " attempts left. No pressure.");
                choice = in.nextInt();
            }
        }
        System.out.println("Too bad, you lost the game!");
    }
}

