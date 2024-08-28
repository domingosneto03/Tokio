package tokio;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chess! (with no rules)");
        Board board = new Board();
        avaliation(board);
        System.out.println("Vamos mover um dos peões");
        board.move(6,2,5, 2);
        avaliation(board);

    }

    private static void avaliation(Board board) {
        System.out.println("Avaliação das brancas: " + board.avalia(Cor.BRANCA));
        System.out.println("Avaliação das pretas: " + board.avalia(Cor.PRETA));
        System.out.println("Avaliação do tabuleiro: " + board.avalia());
        System.out.println();
    }
}