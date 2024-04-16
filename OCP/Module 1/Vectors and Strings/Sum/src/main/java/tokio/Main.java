package tokio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantos números deseja somar?"); // tamanho do vetor
        int answer = Integer.parseInt(in.nextLine());
        int[] list = new int[answer];
        for(int i=0; i< list.length; i++) {
            System.out.println("Digite o " + (i+1) + "º número a ser somado:"); // numeros a serem utilizados para a soma
            int num = Integer.parseInt(in.nextLine());
            list[i] = num;
        }
        int result = sumvarargs(list);
        System.out.println("Soma: " + result);
    }

    static int sumvarargs(int... intArrays) {
        int sum = 0;
        for (int num : intArrays) {
            sum += num;
        }
        return sum;
    }
}
