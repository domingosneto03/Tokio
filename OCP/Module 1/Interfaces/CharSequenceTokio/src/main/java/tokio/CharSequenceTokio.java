package tokio;

public interface CharSequenceTokio {
    /**
     * Devolve o tamanho da sequencia.
     * @return Número de chars que existen na sequencia.
     */
    int length();

    /**
     * Devolve o char que se situa no indice indicado no index.
     * Um índice válido pode ter valores entre 0 e length() - 1.
     * Se o indice no é valido devolver o caracter 0 (char com valor zero)
     *
     * @param index índice dol char a ser devolvido.
     * @return o char localizado no index ou o char com valor zero se o índice esta incorrecto.
     */
    char charAt(int index);

    /**
     * Devolve uma nova CharSequenceTokio que é uma subsequencia da propria
     sequencia.
     * A subsequencia começa no caracter situado na posição start e acaba no
     caracter situado na posição end -1.
     * Se start == end devolve CharSequenceTokio sem caracteres.
     * Se start não é uma posição válida ou se end não é uma posição válida ou se
     * start > end devolve um objeto nulo (null).
     *
     * @param start É o indice de começo, incluido.
     * @param end É o indice de fim, exlcuido.
     * @return A subsequencia especifica ou null se os indices não são validos.
     */
    CharSequenceTokio subSequence(int start, int end);

    /**
     * Devolve uma representação com forma de String da sequencia de
     caracteres.
     * O tamanho da String é igual do tamanho da sequencia.
     * @return Uma String que contém exactamente a mesma sequencia de
    caracteres.
     */
    public String toString();
}
