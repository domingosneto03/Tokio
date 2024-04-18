package tokio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("IteratorBag" +
                "1");
        System.out.println();

        IteratorBag<Integer> iBag = new IteratorBag<>();
        iBag.addAll(getItems());
        System.out.println(iBag.toString());
        System.out.println("Soma de todos os elementos: " + bagSum(iBag));
        System.out.println("O saco está vazio? " + iBag.isEmpty());
        System.out.println("Quantidade de elementos no saco: " + iBag.size());
        System.out.println("Elemento aleatório extraído: " + iBag.extract());
        System.out.println("Quantidade de elementos no saco: " + iBag.size());
        System.out.println("Contém o número 10? " + iBag.contains(10));
        iBag.clear();
        System.out.println(iBag.toString());
        System.out.println("O saco está vazio? " + iBag.isEmpty());
    }

    private static int bagSum(IteratorBag<Integer> bag) {
        int sum = 0;
        for (Integer element : bag) {
            sum += element;
        }
        return sum;
    }

    private static List<Integer> getItems() {
        return List.of(10,20,30,40,50);
    }
}