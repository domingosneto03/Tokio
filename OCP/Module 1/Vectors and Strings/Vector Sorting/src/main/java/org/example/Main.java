package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int randSize = random.nextInt(10) + 4; // tamanho aleatorio do array entre 4 a 13 elementos
        int[] array = new int[randSize];
        System.out.println("Array fornecido:");
        for(int i=0; i<array.length; i++) {
            array[i] = random.nextInt(100);//array com elementos aleatorios
            System.out.print(array[i] + " ");
        }
        System.out.println(); // linha livre
        selectionSort(array);
        System.out.println("Array ordenado de forma descendente:");
        for(int x : array) System.out.print(x + " ");
    }

    private static void selectionSort(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            int max_pos = i;
            for(int j=i+1; j<array.length; j++) {
                if(array[j]>array[max_pos]) max_pos=j; // procura da posição com elemento maior
            }
            int temp = array[max_pos]; // alocação do maior elemento numa variavel temporaria
            array[max_pos] = array[i];
            array[i] = temp; // troca de posicoes
        }
    }
}