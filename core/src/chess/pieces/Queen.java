package chess.pieces;

public class Queen extends Piece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        return (fromRow == toRow || fromCol == toCol) || 
               (Math.abs(toRow - fromRow) == Math.abs(toCol - fromCol));
    }
}
