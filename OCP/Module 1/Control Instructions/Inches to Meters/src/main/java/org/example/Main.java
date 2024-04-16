package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tabela de Conversão de Polegadas em Metros!");
        double metros;
        int count = 0;
        for(double polegadas=1; polegadas<=144; polegadas++) {
            metros = polegadas/39.37; // converter polegadas em metros
            System.out.println(polegadas + " polegadas correpondem a " + metros + " metros.");
            count++;
            if(count%12==0) System.out.println(); // espaço livre a cada 12 linhas
        }
    }
}