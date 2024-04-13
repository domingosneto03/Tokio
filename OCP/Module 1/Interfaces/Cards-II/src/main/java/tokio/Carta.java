package tokio;

public class Carta implements Comparable<Carta> {
	
	private final String numero;
    private final String naipe;

    public Carta(String numero, String naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    /**
     * @return o numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @return O naipe
     */
    public String getNaipe() {
        return naipe;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 47 * hash + (this.naipe != null ? this.naipe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.naipe != other.naipe) {
            return false;
        }
        return true;
    }

    public static int numeroValor(Carta c) {
        int value = switch (c.getNumero()) {
            case "AS" -> 1;
            case "DOIS" -> 2;
            case "TRES" -> 3;
            case "QUATRO" -> 4;
            case "CINCO" -> 5;
            case "SEIS" -> 6;
            case "SETE" -> 7;
            case "VALETE" -> 8;
            case "RAINHA" -> 9;
            case "REI" -> 10;
            default -> 0;
        };
        return value;
    }

    @Override
    public String toString() {
        return numero + " " + naipe;
    }


    @Override
    public int compareTo(Carta other) {
        int naipeComparison = this.naipe.compareTo(other.naipe);
        if (naipeComparison != 0) {
            return naipeComparison;
        }
        return Integer.compare(numeroValor(this), numeroValor(other));
    }

    /*
    public Carta natural(Carta c1, Carta c2) {
        // Comparador de cartas usado no algoritmo de ordenacao
        int alphabeticNaipe = c1.getNaipe().compareTo(c2.getNaipe()); // compara alfabeticamente as duas strings
        if(alphabeticNaipe < 0) return c1;
        else if(alphabeticNaipe > 0) return c2;
        else {
            if(numeroValor(c1) <= numeroValor(c2)) return c1;
            else return c2;
        }
    }
    */
}



