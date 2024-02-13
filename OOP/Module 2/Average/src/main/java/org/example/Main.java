package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Calculadora da Média!");

        Media media = new Media();

        System.out.println("Introduza a primeira nota");
        Scanner in1 = new Scanner(System.in);
        double nota1 = in1.nextDouble();

        System.out.println("Introduza a segunda nota");
        Scanner in2 = new Scanner(System.in);
        double nota2 = in2.nextDouble();

        System.out.println("Introduza a terceira nota");
        Scanner in3 = new Scanner(System.in);
        double nota3 = in3.nextDouble();

        double resultado = media.calcularMedia(nota1, nota2, nota3);
        System.out.println("A sua média é de: " + resultado);
    }
}