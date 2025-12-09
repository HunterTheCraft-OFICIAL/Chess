package chess.pieces;

public class Bishop extends Piece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        return Math.abs(toRow - fromRow) == Math.abs(toCol - fromCol);
    }
}
