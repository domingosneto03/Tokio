package tokio;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lambda!");
        Function<Integer, Integer> factorial = (n) -> {
            int res = 1;
            for(int i=1; i<=n; i++) res*=i;
            return res;
        };

        Scanner in = new Scanner(System.in);
        System.out.println("Escolhe um número para se calcular o seu fatorial");
        int numero = Integer.parseInt(in.nextLine());
        System.out.println(numero + "! é: " + factorial.apply(numero));

    }
}