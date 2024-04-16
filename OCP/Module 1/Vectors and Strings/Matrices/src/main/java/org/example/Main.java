package org.example;

public class Main {
    public static void main(String[] args) {
        double[] array1 = {2.0, 3.0, 5.0, 6.0, 8.0};
        System.out.println("Média do array1: " + Matrizes.mediaArray(array1));
        int[] array2 = {4, 7, 2, 9, 14, 23, 4, 45, 1, 93};
        System.out.println("Mínimo do array2: " + Matrizes.minMax(array2)[0]);
        System.out.println("Máximo do array2: " + Matrizes.minMax(array2)[1]);

    }
}