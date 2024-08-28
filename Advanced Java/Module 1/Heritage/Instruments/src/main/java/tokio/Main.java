package tokio;

import java.util.Random;

public class Main {
    public static final String[] notes = {"DO", "RE", "MI", "FA", "SOL", "LA", "SI"};
    public static String randomNote() {
        Random random = new Random();
        int randIdx = random.nextInt(notes.length);
        return notes[randIdx];
    }
    public static void main(String[] args) {
        System.out.println("Instruments!");
        System.out.println();

        System.out.println("Instrumento de Percursão:");
        Percursao.Timbale timbale = new Percursao.Timbale();
        System.out.println(timbale.tocar(randomNote()));
        System.out.println();

        System.out.println("Instumento de Cordas:");
        Cordas.Violino violino = new Cordas.Violino();
        System.out.println(violino.tocar(randomNote()));
        System.out.println();

        System.out.println("Instrumento de Sopro:");
        Sopro.Tuba tuba = new Sopro.Tuba();
        System.out.println(tuba.tocar(randomNote()));
        System.out.println();

        System.out.println("Orquestra:");
        Orquestra orquestra = new Orquestra();
        System.out.println(orquestra.tocar(randomNote()));
    }
}