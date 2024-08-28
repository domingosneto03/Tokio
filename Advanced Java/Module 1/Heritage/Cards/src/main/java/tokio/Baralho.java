package tokio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
	
	public static final String[] numeros ={"AS", "DOIS", "TRES", "QUATRO",
            "CINCO", "SEIS", "SETE", "VALETE", "RAINHA", "REI"};
    public static final String[] naipes ={"ESPADAS", "COPAS", "PAUS", "OUROS"};
    private List<Carta> cartas = new ArrayList();

    public Baralho() {
        for (String naipe : naipes) {
            for (String numero : numeros) {
                cartas.add(new Carta(numero, naipe));
            }
        }
    }

    public Carta getCarta(int posicao) {
        return (Carta)cartas.get(posicao);
    }

    public Molho getMolho() {
        List<Carta> cartasAux = new ArrayList(cartas);
        Collections.shuffle(cartasAux);
        Molho m = new Molho();
        for (Carta carta : cartasAux) {
            m.adicionarCarta(carta);
        }
        return m;
    }
}


