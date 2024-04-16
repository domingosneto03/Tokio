package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Contagem de espaços até a um ponto");
        System.out.println("Escreve alguma frase. Não te esqueças de terminar com um ponto final");
        Scanner in = new Scanner(System.in);
        String frase = in.nextLine();
        int numeroEspacos = 0;
        for(int i=0; i<frase.length(); i++) {
            if(frase.charAt(i) == ' ') numeroEspacos++;
            else if(frase.charAt(i) == '.') break;
        }
        System.out.println("Número de espaços: " + numeroEspacos);
    }
}