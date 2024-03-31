package M1_T06_P25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
	
	public static final String[] numeros ={"AS", "DOIS", "TRES", "QUATRO",
            "CINCO", "SEIS", "SETE", "VALETE", "RAINHA", "REI"};
    public static final String[] naipes ={"ESPADAS", "COPAS", "PAUS", "OUROS"};
    private List cartas = new ArrayList();

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
        List cartasAux = new ArrayList(cartas);
        Collections.shuffle(cartasAux);
        Molho m = new Molho();
        for (Object carta : cartasAux) {
            m.adicionarCarta((Carta)carta);
        }
        return m;
    }
}


