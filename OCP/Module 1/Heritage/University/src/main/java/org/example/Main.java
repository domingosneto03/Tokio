package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Universidade!");
        System.out.println();
        Pessoal[] listaPessoal = new Pessoal[10];
        listaPessoal[0] = new Administrador("Xico", "00000000-XYZ", 0);
        listaPessoal[1] = new Informatico("Domingos", "11111111-XYZ", 5);
        listaPessoal[2] = new Professor("Preto", "22222222-XYZ", 0);
        listaPessoal[3] = new Investigador("Joana", "33333333-XYZ");
        listaPessoal[4] = new Administrador("Victor", "69696969-XYZ", 3);
        listaPessoal[5] = new Informatico("Pina", "44444444-XYZ", 3);
        listaPessoal[6] = new Professor("Moucho", "55555555-XYZ", 2);
        listaPessoal[7] = new Professor("Guedes", "66666666-XYZ", 1);
        listaPessoal[8] = new Informatico("Contreiras", "00000001-XYZ", 8);
        listaPessoal[9] = new Investigador("Ahmed", "egito-XYZ");

        Universidade.imprimirNominas(listaPessoal);
        Universidade.obterOrcamentiTotal(listaPessoal);
    }
}