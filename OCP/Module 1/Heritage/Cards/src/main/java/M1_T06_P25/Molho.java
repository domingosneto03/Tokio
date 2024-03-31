package M1_T06_P25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Molho {
	
	 	List cartas;
	    private AlgoritmoOrdenacao algoritmo;

	    public void setAlgoritmo(AlgoritmoOrdenacao algoritmo) {
	        // Establece o algoritmo de ordenacao
	    }

	    public void ordena() {
	        // Executa o algoritmo de ordenacao
	    }

	    /**
		 * Cria um molho de cartas vazia
	     */
	    public Molho() {
	        cartas = new ArrayList();
	    }

	    /**
	     * Devolve a carta de una posicao dada
	     *
	     * @param posicao A posicao da carta
	     * @return A carta da dita posicao
	     * @exception IllegalArgumentException Se a posicao nao e valida na lista
	     */
	    public Carta getCarta(int posicao) {
	        return (Carta)cartas.get(posicao);
	    }

	    /**
	     * Adiciona uma carta no molho na posicao dada. As cartas que estao
	     * dispostas da posicao dada avançam uma posicao
	     *
	     * @param posicao Posicao a adicionar
	     * @param carta Carta a adicionar
	     * @exception IllegalArgumentException se a posicao nao e valida na lista
	     */
	    public void inserirCarta(int posicao, Carta carta) {
	        List<Carta> aux = new ArrayList<>();

	        // Extraimos as cartas desde da posicao dada num array auxiliar
	        for (int i = cartas.size() - 1; i >= posicao; i--) {
	            aux.add((Carta)cartas.remove(i));
	        }

	        // Inserimos a carta passada por parametro
	        cartas.add(carta);

	        // Voltarmos a inserir as cartas extraidas
	        for (int i = aux.size() - 1; i >= 0; i--) {
	            cartas.add(aux.get(i));
	        }
	    }

	    /**
	     * Extrai a carta da posicao dada, as outras recuam 1 posicao
	     *
	     * @param posicao Posicao de extraccao
	     * @return Carta que estava na dita posicao
	     * @exception IllegalArgumentException Se a posicao nao for valida na lista
	     */
	    public Carta extrairCarta(int posicao) {
	        return (Carta)cartas.remove(posicao);
	    }

	    /**
	     * Devolve a carta de topo do molho
	     *
	     * @return A carta que está no topo do molho
	     */
	    public Carta extrairCarta() {
	        return (Carta)cartas.remove(cartas.size() - 1);
	    }

	    /**
	     * Adiciona uma carta no final do molho
	     *
	     * @param carta Carta a adicionar
	     */
	    public void adicionarCarta(Carta carta) {
	        cartas.add(carta);
	    }

	    /**
	     * Devolve o numero de cartas do molho
	     *
	     * @return numero de cartas
	     */
	    public int numCartas() {
	        return cartas.size();
	    }

	    public void baralhar() {
	        Collections.shuffle(cartas);
	    }

	    @Override
	    public String toString() {
	        return "" + cartas;
	    }
	}




