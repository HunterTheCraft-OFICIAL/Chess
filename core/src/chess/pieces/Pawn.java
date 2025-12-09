package chess.pieces;

public class Pawn extends Piece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        int direction = color.equals("white") ? -1 : 1;
        // Movimento simples para frente
        if (fromCol == toCol && toRow == fromRow + direction) {
            return true;
        }
        // Movimento inicial de 2 casas
        if (fromCol == toCol && ((color.equals("white") && fromRow == 6) || (color.equals("black") && fromRow == 1))
                && toRow == fromRow + 2 * direction) {
            return true;
        }
        // Captura diagonal
        if (Math.abs(toCol - fromCol) == 1 && toRow == fromRow + direction) {
            return true;
        }
        return false;
    }
}
