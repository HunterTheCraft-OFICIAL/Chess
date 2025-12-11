package chess;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import chess.ui.BoardRenderer;

/**
 * Classe principal do jogo de xadrez.
 * Responsável por inicializar e renderizar o tabuleiro.
 */
public class ChessGame extends ApplicationAdapter {
    private BoardRenderer boardRenderer;

    @Override
    public void create() {
        try {
            // Inicializa o renderizador do tabuleiro
            boardRenderer = new BoardRenderer();
            Gdx.app.log("ChessGame", "Tabuleiro inicial pronto!");
        } catch (Exception e) {
            Gdx.app.error("ChessGame", "Erro ao inicializar BoardRenderer", e);
        }
    }

    @Override
    public void render() {
        // Limpa a tela com cor preta
        Gdx.gl.glClearColor(0f, 0f, 0f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Atualiza lógica do jogo
        update();

        // Desenha o tabuleiro
        if (boardRenderer != null) {
            try {
                boardRenderer.render();
            } catch (Exception e) {
                Gdx.app.error("ChessGame", "Erro ao renderizar tabuleiro", e);
            }
        }
    }

    /**
     * Atualiza a lógica do jogo.
     * Atualmente vazio, mas pronto para futuras expansões
     * (movimentos, IA, timers, etc.).
     */
    private void update() {
        // TODO: adicionar lógica de atualização do jogo
    }

    @Override
    public void dispose() {
        if (boardRenderer != null) {
            try {
                boardRenderer.dispose();
                Gdx.app.log("ChessGame", "Recursos liberados com sucesso!");
            } catch (Exception e) {
                Gdx.app.error("ChessGame", "Erro ao liberar recursos", e);
            }
            boardRenderer = null;
        }
    }
}