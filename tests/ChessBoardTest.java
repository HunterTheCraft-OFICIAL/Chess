import org.junit.Test;
import static org.junit.Assert.*;
import chess.board.ChessBoard;

public class ChessBoardTest {
    @Test
    public void testBoardSetup() {
        ChessBoard board = new ChessBoard();
        assertNotNull(board.getPiece(0, 0)); // torre preta
        assertNotNull(board.getPiece(7, 4)); // rei branco
    }
}