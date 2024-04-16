package tokio;

public class Board {
    private final Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        initBoard();
    }

    private void initBoard() {
        board[0][0] = new Piece(Cor.BRANCA, Tipo.TORRE);
        board[0][1] = new Piece(Cor.BRANCA, Tipo.CAVALO);
        board[0][2] = new Piece(Cor.BRANCA, Tipo.BISPO);
        board[0][3] = new Piece(Cor.BRANCA, Tipo.DAMA);
        board[0][4] = new Piece(Cor.BRANCA, Tipo.REI);
        board[0][5] = new Piece(Cor.BRANCA, Tipo.BISPO);
        board[0][6] = new Piece(Cor.BRANCA, Tipo.CAVALO);
        board[0][7] = new Piece(Cor.BRANCA, Tipo.TORRE);
        for(int i=0; i<8; i++) board[1][i] = new Piece(Cor.BRANCA, Tipo.PEAO);

        board[7][0] = new Piece(Cor.PRETA, Tipo.TORRE);
        board[7][1] = new Piece(Cor.PRETA, Tipo.CAVALO);
        board[7][2] = new Piece(Cor.PRETA, Tipo.BISPO);
        board[7][3] = new Piece(Cor.PRETA, Tipo.DAMA);
        board[7][4] = new Piece(Cor.PRETA, Tipo.REI);
        board[7][5] = new Piece(Cor.PRETA, Tipo.BISPO);
        board[7][6] = new Piece(Cor.PRETA, Tipo.CAVALO);
        board[7][7] = new Piece(Cor.PRETA, Tipo.TORRE);
        for(int i=0; i<8; i++) board[6][i] = new Piece(Cor.PRETA, Tipo.PEAO);

        draw();
    }

    public void move(int row, int col, int new_row, int new_col) {
        board[new_row][new_col] = board[row][col];
        board[row][col] = null;
        draw();

    }

    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public int avalia(Cor cor) {
        int res = 0;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = board[row][col];
                if (piece != null && piece.getCor() == cor) {
                    res += piece.getTipo().getValor();
                }
            }
        }
        return res;
    }

    public int avalia() {
        return avalia(Cor.BRANCA) - avalia(Cor.PRETA);
    }

    public void draw() {
        System.out.println();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Piece piece = board[row][col];
                if (piece == null) {
                    System.out.print("-- ");
                } else {
                    String cor = piece.getCor() == Cor.BRANCA ? "B" : "P";
                    String tipo = piece.getTipo().toString().substring(0, 1);
                    System.out.print(cor + tipo + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
