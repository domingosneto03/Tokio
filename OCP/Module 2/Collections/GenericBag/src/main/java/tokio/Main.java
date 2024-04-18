package tokio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Generic Bag!");
        System.out.println();

        GenericBag<Integer> iBag = new GenericBag<>();
        iBag.add(10);
        iBag.add(20);
        iBag.add(30);
        System.out.println(iBag.toString());
        System.out.println("O saco está vazio? " + iBag.isEmpty());
        System.out.println("Quantidade de elementos no saco: " + iBag.size());
        System.out.println("Elemento aleatório extraído: " + iBag.extract());
        System.out.println(iBag.toString());
        iBag.add(35);
        iBag.add(50);
        System.out.println(iBag.toString());
        System.out.println("Contém o número 10? " + iBag.contains(10));
        iBag.clear();
        System.out.println(iBag.toString());
        System.out.println("O saco está vazio? " + iBag.isEmpty());

    }
}