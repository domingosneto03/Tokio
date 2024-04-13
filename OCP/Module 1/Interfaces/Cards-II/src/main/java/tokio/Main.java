package tokio;

public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        Molho molho = baralho.getMolho();

        // Print the unsorted deck
        System.out.println("Unsorted deck:");
        System.out.println(molho.toString());

        // Sort the deck using natural order (naipe first, then number)
        molho.naturalSort();
        System.out.println("\nSorted deck (natural order):");
        System.out.println(molho.toString());

        // Sort the deck using custom Comparator (number first, then naipe)
        molho.ordena(new OrdNumIncPal());
        System.out.println("\nSorted deck (number first, then naipe):");
        System.out.println(molho.toString());

        // Sort the deck using custom Comparator (naipe first, then number)
        molho.ordena(new OrdPalNumDec());
        System.out.println("\nSorted deck (naipe first, then number):");
        System.out.println(molho.toString());
    }
}