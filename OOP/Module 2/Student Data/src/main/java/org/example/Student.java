package org.example;

public class Student {
    public String nome;
    public int idade;
    public double[] notas;

    public void print(String nome, int idade, double[] notas) {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
        if(notas!=null)
            for (double nota : notas) System.out.println("Nota do aluno: " + nota);
    }

    public void media(double[] notas) {
        double sum = 0;
        for(double nota : notas) sum += nota;
        double media = sum/notas.length;
        if(media>6)
            System.out.println("Aluno aprovado com média de: " + media);
        else
            System.out.println("Aluno reprovado com média de: " + media);
    }
}
