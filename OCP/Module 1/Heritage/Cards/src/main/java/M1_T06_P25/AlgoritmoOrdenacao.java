package M1_T06_P25;

import java.util.List;

abstract class AlgoritmoOrdenacao { // de acordo com o enunciado a classe é abstrata
	
	 /**
     * Ordena uma lista de cartas recibo por parametro
     * @param listaCartas Lista de cartas que fica ordenada no final do algoritmo
     */
    abstract void ordena(List<Carta> listaCartas);
		//TODO: Para implementar

	// metodo para converter o numero da carta para valor numerico
	public int numeroValor(Carta c) {
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

}
