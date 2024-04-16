package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Collatz!");
        System.out.println("Escolha um número inteiro positivo");
        int number = Integer.parseInt(in.nextLine());
        while (number!=1) { // enquanto não obtermos 1
            if(number%2==0) { // se for par
                int original = number;
                number/=2;
                System.out.println(original + ", é par logo divide-se por 2 => " + number);
            }
            else { // se for ímpar
                int original = number;
                number = (number*3) + 1;
                System.out.println(original + ", é ímpar logo multiplica-se por 3 e soma-se 1 => " + number);
            }
        }
    }
}