package tokio;

import java.util.List;

public class OrdPalNumDec implements Comparator{

	@Override
	public int compare(Carta c1, Carta c2) {
		// Comparador de cartas usado no algoritmo de ordenacao
		int alphabeticNaipe = c1.getNaipe().compareTo(c2.getNaipe()); // compara alfabeticamente as duas strings
		if(alphabeticNaipe < 0) return 1;
		else if(alphabeticNaipe > 0) return -1;
		else {
			if(Carta.numeroValor(c1) <= Carta.numeroValor(c2)) return 1;
			else return -1;
		}
	}
}
