package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduza o nome do aluno");
        String name = scan.nextLine();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Introduza a idade do aluno");
        int age = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        double[] grades = new double[2];
        System.out.println("Introduza as notas do aluno");
        for(int i=0; i<grades.length; i++)
            grades[i] = scan2.nextDouble();

        student.print(name, age, grades);
        student.media(grades);

    }
}