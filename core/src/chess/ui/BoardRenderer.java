package chess.ui;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.Color;

public class BoardRenderer {
    private ShapeRenderer shapeRenderer;

    public BoardRenderer() {
        shapeRenderer = new ShapeRenderer();
    }

    public void render() {
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        int tileSize = 64; // tamanho de cada casa
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    shapeRenderer.setColor(Color.WHITE);
                } else {
                    shapeRenderer.setColor(Color.DARK_GRAY);
                }
                shapeRenderer.rect(col * tileSize, row * tileSize, tileSize, tileSize);
            }
        }

        shapeRenderer.end();
    }

    public void dispose() {
        shapeRenderer.dispose();
    }
}