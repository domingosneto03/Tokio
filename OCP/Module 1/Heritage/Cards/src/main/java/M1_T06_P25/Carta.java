package M1_T06_P25;

public class Carta {
	
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

    @Override
    public String toString() {
        return numero + " " + naipe;
    }
}



