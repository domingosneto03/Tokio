package tokio;

public enum Numero {
    AS('A'),
    DOIS('2'),
    TRÊS('3'),
    QUATRO('4'),
    CINCO('5'),
    SEIS('6'),
    SETE('7'),
    VALETE('V'),
    DAMA('D'),
    REI('R');

    private char abv;

    Numero(char abv) {
        this.abv = abv;
    }

    public char getAbv() {
        return abv;
    }
}
