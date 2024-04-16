package tokio;

public enum Tipo {
    PEAO(1),
    TORRE(5),
    CAVALO(3),
    BISPO(3),
    DAMA(9),
    REI(0);

    private final int valor;

    Tipo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
