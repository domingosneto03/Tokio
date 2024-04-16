package tokio;

public enum Naipe {
    ESPADAS('E'),
    COPAS('C'),
    PAUS('P'),
    OUROS('O');

    private char abv;

    Naipe(char abv) {
        this.abv = abv;
    }

    public char getAbv() {
        return abv;
    }
}
