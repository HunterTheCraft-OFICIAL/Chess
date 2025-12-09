package chess.pieces;

public abstract class Piece {
    protected String color; // "white" ou "black"

    public Piece(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol);
}
