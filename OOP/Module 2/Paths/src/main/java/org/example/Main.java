package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Escolha do Caminho!");
        Scanner in = new Scanner(System.in);
        System.out.println("Escolha um destes 3 caminhos \n" + "Caminho A \n" + "Caminho B \n" + "Caminho C" );
        String caminho = in.nextLine();

        if(caminho.equals("A") || caminho.equals("a"))
            System.out.println("Escolheu o Caminho A: É um caminho seguro e tranquilo!");
        else if(caminho.equals("B") || caminho.equals("b"))
            System.out.println("Escolheu o Caminho B: É um caminho onde descobres todas as verdades do universo!");
        else if(caminho.equals("C") || caminho.equals("c"))
            System.out.println("Escolheu o Caminho C: É um caminho semsalvação e perigo eminente!");
        else
            System.out.println("Malandro! Querias fugir da matrix mas não és nenhum Keanu Reeves");
    }
}