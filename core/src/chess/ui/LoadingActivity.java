package chess.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class LoadingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Aqui você pode usar um layout XML simples com logo ou texto "Carregando..."
        // Por enquanto vamos só simular com um delay
        new Handler().postDelayed(() -> {
            // Depois de carregar, vai para o Menu Principal
            Intent intent = new Intent(LoadingActivity.this, MainMenuActivity.class);
            startActivity(intent);
            finish();
        }, 2000); // 2 segundos de tela de carregamento
    }
}