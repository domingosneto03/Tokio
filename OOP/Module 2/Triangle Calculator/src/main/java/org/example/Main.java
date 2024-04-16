package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Bem-vindo à Calculadora de Triângulos");
        boolean flag = true;
        while(flag) {
            System.out.println("Escolha a seguinte opção: \n" +
                    "(1) Calcular a área do triângulo \n" +
                    "(2) Sair");
            int option = in.nextInt();
            if(option==1){
                System.out.println("Insira 3 lados para o triângulo");
                Scanner in2 = new Scanner(System.in);
                double ladoA = in2.nextDouble();
                Scanner in3 = new Scanner(System.in);
                double ladoB = in3.nextDouble();
                Scanner in4 = new Scanner(System.in);
                double ladoC = in4.nextDouble();
                triangle.area(ladoA, ladoB, ladoC);
                triangle.type(ladoA, ladoB, ladoC);
            }
            else flag=false;
        }
    }

}