package tokio;

import java.util.List;

public class OrdPalNumInc extends AlgoritmoOrdenacao{
	
	@Override
    public void ordena(List<Carta> listaCartas) {
        // Algoritmo de ordenacao
        for(int i = 0; i<listaCartas.size()-1; i++) {
            int minIdx = i;
            for(int j = i+1; j<listaCartas.size(); j++) {
                if(listaCartas.get(j) == comparadorCarta(listaCartas.get(j), listaCartas.get(minIdx))) minIdx = j;
            }
            if(minIdx != i) {
                Carta temp = listaCartas.get(i);
                listaCartas.set(i, listaCartas.get(minIdx));
                listaCartas.set(minIdx, temp);
            }
        }

    }

    public Carta comparadorCarta(Carta c1, Carta c2) {
        // Comparador de cartas usado no algoritmo de ordenacao
        int alphabeticNaipe = c1.getNaipe().compareTo(c2.getNaipe()); // compara alfabeticamente as duas strings
        if(alphabeticNaipe < 0) return c1;
        else if(alphabeticNaipe > 0) return c2;
        else {
            if(numeroValor(c1) <= numeroValor(c2)) return c1;
            else return c2;
        }
    }

}
