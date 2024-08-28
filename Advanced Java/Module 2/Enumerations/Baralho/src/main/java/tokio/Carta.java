package tokio;

public class Carta {
    private final Naipe naipe;
    private final Numero numero;

    public Carta(Naipe naipe, Numero numero) {
        this.naipe = naipe;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" +
                naipe.getAbv() + numero.getAbv() +
                ", naipe: " + naipe +
                ", número: " + numero +
                '}';
    }
}
