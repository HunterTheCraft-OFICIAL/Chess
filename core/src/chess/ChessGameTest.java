package chess;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testes básicos para o núcleo do jogo de xadrez.
 */
public class ChessGameTest {

    @Test
    public void testGameInitialization() {
        ChessGame game = new ChessGame();
        assertNotNull("O jogo deve ser inicializado", game);
    }

    @Test
    public void testBoardRendererExists() {
        ChessGame game = new ChessGame();
        game.create();
        assertNotNull("O BoardRenderer deve ser criado", 
                      game.getBoardRenderer());
    }
}