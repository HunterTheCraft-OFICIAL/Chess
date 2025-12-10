package chess.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.Gdx;

/**
 * Responsável por desenhar o tabuleiro de xadrez.
 */
public class BoardRenderer {
    private ShapeRenderer shapeRenderer;
    private final int tileSize = 64; // tamanho de cada casa
    private final int boardSize = 8; // número de casas por linha/coluna

    public BoardRenderer() {
        shapeRenderer = new ShapeRenderer();
    }

    /**
     * Renderiza o tabuleiro de 8x8 casas alternando cores.
     */
    public void render() {
        if (shapeRenderer == null) return;

        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                // alterna cor das casas
                Color tileColor = ((row + col) % 2 == 0) ? Color.WHITE : Color.DARK_GRAY;
                shapeRenderer.setColor(tileColor);

                shapeRenderer.rect(col * tileSize, row * tileSize, tileSize, tileSize);
            }
        }

        shapeRenderer.end();
    }

    /**
     * Libera recursos gráficos.
     */
    public void dispose() {
        if (shapeRenderer != null) {
            shapeRenderer.dispose();
            shapeRenderer = null;
            Gdx.app.log("BoardRenderer", "ShapeRenderer liberado.");
        }
    }
}