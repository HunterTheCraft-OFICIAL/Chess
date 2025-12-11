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

        // Configurações recomendadas
        config.useImmersiveMode = true;   // tela cheia
        config.useGL30 = false;           // força OpenGL ES 2.0 (mais compatível)
        config.disableAudio = false;      // mantém áudio ativo (se não usar, pode ser true)
        config.useCompass = false;        // desativa sensores não usados
        config.useAccelerometer = false;  // desativa sensores não usados

        // Inicializa o núcleo do jogo
        initialize(new ChessGame(), config);
    }
}