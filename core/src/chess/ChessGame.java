package chess;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import chess.ui.BoardRenderer;

public class ChessGame extends ApplicationAdapter {
    private BoardRenderer boardRenderer;

    @Override
    public void create() {
        boardRenderer = new BoardRenderer();
        System.out.println("Tabuleiro inicial pronto!");
    }

    @Override
    public void render() {
        // Limpa a tela com cor preta
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Desenha o tabuleiro
        boardRenderer.render();
    }

    @Override
    public void dispose() {
        boardRenderer.dispose();
    }
}