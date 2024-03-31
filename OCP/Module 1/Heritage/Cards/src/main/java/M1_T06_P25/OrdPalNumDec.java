package M1_T06_P25;

import java.util.List;

public class OrdPalNumDec extends AlgoritmoOrdenacao{
	
	 @Override
	    public void ordena(List<Carta> listaCartas) {
			// algoritmo de ordenacao
			 for(int i = 0; i<listaCartas.size()-1; i++) {
				 int maxIdx = i;
				 for(int j = i+1; j<listaCartas.size(); j++) {
					 if(listaCartas.get(j) == comparadorCarta(listaCartas.get(j), listaCartas.get(maxIdx))) maxIdx = j;
				 }
				 if(maxIdx != i) {
					 Carta temp = listaCartas.get(i);
					 listaCartas.set(i, listaCartas.get(maxIdx));
					 listaCartas.set(maxIdx, temp);
				 }
			 }
	    }

	    public Carta comparadorCarta(Carta c1, Carta c2) {
	        // Comparador de cartas usado no algoritmo de ordenacao
			int alphabeticNaipe = c1.getNaipe().compareTo(c2.getNaipe()); // compara alfabeticamente as duas strings
			if(alphabeticNaipe < 0) return c2;
			else if(alphabeticNaipe > 0) return c1;
			else {
				if(numeroValor(c1) <= numeroValor(c2)) return c2;
				else return c1;
			}
	    }

}
