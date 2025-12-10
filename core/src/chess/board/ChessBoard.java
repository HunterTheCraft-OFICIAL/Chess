package chess.board;

public class ChessBoard {
    private final int rows = 8;
    private final int cols = 8;
    private char[][] board;

    public ChessBoard() {
        board = new char[rows][cols];
        initializeBoard();
    }

    private void initializeBoard() {
        // Inicializa todas as casas como vazias
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                board[row][col] = '.';
            }
        }

        // Exemplo simples: colocar peões
        for (int col = 0; col < cols; col++) {
            board[1][col] = 'P'; // Peões brancos
            board[6][col] = 'p'; // Peões pretos
        }

        // Exemplo simples: colocar torres
        board[0][0] = board[0][7] = 'R'; // Torres brancas
        board[7][0] = board[7][7] = 'r'; // Torres pretas
    }

    public char[][] getBoard() {
        return board;
    }

    public void printBoard() {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}