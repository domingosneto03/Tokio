package org.example;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bag myBag = new Bag();

        // Adicionando itens à Bag
        myBag.putInBag(getItems());
        System.out.println(myBag.getItems());

        // Removendo e imprimindo um elemento aleatório da Bag
        System.out.println(myBag.takeFromBag());
        System.out.println(myBag.getItems());
    }

    private static List<String> getItems() {
        return List.of(
                "Pen",
                "Book",
                "Laptop",
                "Powerbank",
                "Keys"
        );
    }
}
