package chess.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainMenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Layout básico em código (pode ser substituído por XML depois)
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        // Botão Jogar
        Button playButton = new Button(this);
        playButton.setText("Jogar");
        playButton.setOnClickListener(v -> {
            // Chama o AndroidLauncher (onde está o jogo)
            Intent intent = new Intent(MainMenuActivity.this, AndroidLauncher.class);
            startActivity(intent);
        });

        // Botão Em Breve (placeholder)
        Button soonButton = new Button(this);
        soonButton.setText("Em Breve");
        soonButton.setEnabled(false); // desativado por enquanto

        layout.addView(playButton);
        layout.addView(soonButton);

        setContentView(layout);
    }
}