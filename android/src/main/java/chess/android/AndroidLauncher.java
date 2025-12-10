package chess.android;

import android.os.Bundle;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import chess.ChessGame;

public class AndroidLauncher extends AndroidApplication {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

        // Configurações opcionais
        config.useImmersiveMode = true;   // tela cheia
        config.useGL30 = false;           // OpenGL ES 3.0 (false por padrão, true só se necessário)

        // Inicializa o núcleo do jogo
        initialize(new ChessGame(), config);
    }
}