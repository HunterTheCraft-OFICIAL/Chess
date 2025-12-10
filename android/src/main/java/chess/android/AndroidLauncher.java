//package chess.android;
package com.chess.xadrez;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.chess.xadrez.core.ChessGame; // ajuste para o nome da sua classe principal

public class AndroidLauncher extends AndroidApplication {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        config.useImmersiveMode = true;   // tela cheia
        config.hideStatusBar = true;      // sem barra de status
        config.useGL30 = true;            // usa OpenGL ES 3.0

        // Inicializa o núcleo do jogo
        initialize(new ChessGame(), config);
    }
}