package tokio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cartas!");
        Carta carta = new Carta(Naipe.ESPADAS, Numero.CINCO);
        System.out.println(carta);
        Carta carta2 = new Carta(Naipe.COPAS, Numero.AS);
        System.out.println(carta2);
    }
}