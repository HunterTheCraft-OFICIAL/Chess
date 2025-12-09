package chess.pieces;

public class Rook extends Piece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        return (fromRow == toRow || fromCol == toCol);
    }
}

