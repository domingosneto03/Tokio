package tokio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Animais");
        System.out.println();
        List<Animais> animais = animais();
        for(Animais x : animais) {
            if(x.getComida()!=Comida.ANY && x.getComida()!=Comida.RACAO) x.marcarComoPerigoso();
            System.out.println(x.isPerigoso());
        }

        Function<List<Animais>, Integer> eliminarPerigosos = (list) -> {
            int count = 0;
            Iterator<Animais> iterator = list.iterator();
            while (iterator.hasNext()) {
                Animais animal = iterator.next();
                if (animal.isPerigoso()) {
                    iterator.remove();
                    count++;
                }
            }
            return count;
        };

        Consumer<List<Animais>> listarNomes = (list) -> {
            for(Animais x : list) System.out.println("Nome do animal: " + x.getNome());
        };

        Consumer<Integer> colocarAlimento = (quantidade) -> {
            for(Animais x : animais) x.alimentar(quantidade);
        };

        Function<List<Animais>, Integer> eliminarPalitos = (list) -> {
            int count = 0;
            Iterator<Animais> iterator = list.iterator();
            while (iterator.hasNext()) {
                Animais animal = iterator.next();
                if (animal.getPeso() < 10) {
                    iterator.remove();
                    count++;
                }
            }
            return count;
        };

        System.out.println("Lista de animais:");
        for(Animais x : animais) System.out.println(x.toString());
        System.out.println();
        System.out.println("Vamos listar todos os nomes dos animais");
        listarNomes.accept(animais);
        System.out.println();
        System.out.println("Vamos dar-lhes de comer");
        colocarAlimento.accept(10);
        for(Animais x : animais) System.out.println(x.toString());
        System.out.println();
        System.out.println("Vamos eliminar os animais perigosos");
        System.out.println("Numero de animais eliminados: " + eliminarPerigosos.apply(animais));
        System.out.println("Lista sem animais perigosos:");
        for(Animais x : animais) System.out.println(x.toString());
        System.out.println();
        List<Animais> animais2 = animais();
        System.out.println("Vamos eliminar quem tem menos de 10kg");
        System.out.println("Numero de animais eliminados: " + eliminarPalitos.apply(animais2));
        System.out.println("Lista sem animais palitos:");
        for(Animais x : animais2) System.out.println(x.toString());
        System.out.println();



    }

    private static List<Animais> animais() {
        List<Animais> list = new ArrayList<>();
        Animais cao = new Animais("Max", "Cão malandro", "Golden Retriever", 50.00, 65.00, Comida.ANY);
        Animais gato = new Animais("Garfield", "Gata és tu!", "Persa", 5.40, 23.50, Comida.RACAO);
        Animais aguia = new Animais("Senu", "Companheira de Bayek", "Bonelli", 1.9, 100.00, Comida.CARNE);
        Animais leao = new Animais("Simba", "Rei da selva", "Rei", 190.00, 120.00, Comida.CARNE);
        Animais pinguim = new Animais("Capitão", "Sorri e acena", "Snares", 1.20, 30.00, Comida.PEIXE);
        Animais macaco = new Animais("Dexter", "Curioso e brincalhão", "Macaco Aranha", 15.00, 70.00, Comida.ANY);
        Animais elefante = new Animais("Dumbo", "Elefante voador", "Elefante Africano", 5000.00, 400.00, Comida.VEGETAIS);
        Animais tigre = new Animais("Shere Khan", "O grande inimigo", "Bengal", 150.00, 90.00, Comida.CARNE);
        list.add(cao);
        list.add(gato);
        list.add(leao);
        list.add(aguia);
        list.add(pinguim);
        list.add(elefante);
        list.add(macaco);
        list.add(tigre);
        return list;
    }


}