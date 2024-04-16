package org.example;

import java.util.Scanner;
public class Main {
    int gumPrice = 3;
    int chocolateBarPrice = 5;

    /*
    ENUNCIADO: O método candyCalculator deve receber um número de créditos e imprimir
    quantos chocolates e quantas chicletes conseguimos comprar com esse
    número de créditos bem como o troco a devolver, sabendo que o utilizador
    quer o maior número de chocolates possível.
    */

    private static void candyCalculator(int credits) {
        int chocolates = 0;
        int chicletes = 0;
        int troco = 0;
        boolean flag = true;
        while(flag) {
            if(credits>=5) {
                credits-=5;
                chocolates++;
            }
            else {
                if(credits>=3) {
                    credits-=3;
                    chicletes++;
                }
                else {
                    troco = credits;
                }
            }
            if(credits==troco) {
                System.out.println(chocolates + " chocolates " + chicletes + " chicletes " + troco + " troco");
                flag = false;
            }
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos créditos tens?");
        int credits = scanner.nextInt();
        candyCalculator(credits);
    }
}