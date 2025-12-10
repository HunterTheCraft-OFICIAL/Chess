# Xadrez com LibGDX

> ⚠️ Este projeto foi iniciado a partir de um clone do repositório [Mindustry](https://github.com/Anuken/Mindustry).  
> Última versão utilizada: commit `a01e4be75d53e7e06d9816b19078e49102215e66` (02/12/2025).  
> O histórico original foi removido para manter o repositório leve, mas os créditos ao autor original permanecem.

---

## Objetivo
Desenvolver um jogo de xadrez para Android usando a biblioteca **LibGDX**, aproveitando a base de configuração do Mindustry.

## Estrutura inicial
- `Main.java` → inicialização da aplicação LibGDX.  
- `ChessBoard.java` → renderização do tabuleiro 8x8.  
- `Piece.java` → representação das peças de xadrez.  
- `.gitignore` → arquivos ignorados no versionamento.  

## Próximos passos
1. Garantir compilação básica com LibGDX intacto.  
2. Renderizar tabuleiro e peças estáticas.  
3. Implementar regras de movimento.  
4. Evoluir para IA ou multiplayer.

---

Estrutura atual do Xadrez:

 ```
Xadrez/  
  ./.github
  ./.github/ISSUE_TEMPLATE
  ./.github/ISSUE_TEMPLATE/bug_report.yml
  ./.github/ISSUE_TEMPLATE/config.yml
  ./.github/ISSUE_TEMPLATE/feature_request.yml
  ./.github/workflows
  ./.github/workflows/build-pr.yml
  ./.github/workflows/gradle-wrapper-validation.yml
  ./.github/workflows/push.yml
  ./.github/workflows/push-android.yml
  ./.github/workflows/release.yml
  ./.github/pull_request_template.md
  ./android
  ./android/res  
  ./android/res/drawable
  ./android/res/drawable/ic_launcher.png
  ./android/res/drawable/ic_launcher_background.png 
  ./android/res/mipmap-anydpi-v26
  ./android/res/mipmap-anydpi-v26/ic_launcher.xml
  ./android/res/mipmap-anydpi-v26/ic_launcher_round.xml
  ./android/res/mipmap-hdpi
  ./android/res/mipmap-hdpi/ic_launcher.png
  ./android/res/mipmap-hdpi/ic_launcher_background.png
  ./android/res/mipmap-hdpi/ic_launcher_foreground.png
  ./android/res/mipmap-hdpi/ic_launcher_round.png
  ./android/res/mipmap-mdpi
  ./android/res/mipmap-mdpi/ic_launcher.png
  ./android/res/mipmap-mdpi/ic_launcher_background.png
  ./android/res/mipmap-mdpi/ic_launcher_foreground.png
  ./android/res/mipmap-mdpi/ic_launcher_round.png
  ./android/res/mipmap-xhdpi
  ./android/res/mipmap-xhdpi/ic_launcher.png
  ./android/res/mipmap-xhdpi/ic_launcher_background.png
  ./android/res/mipmap-xhdpi/ic_launcher_foreground.png
  ./android/res/mipmap-xhdpi/ic_launcher_round.png 
  ./android/res/mipmap-xxhdpi
  ./android/res/mipmap-xxhdpi/ic_launcher.png
  ./android/res/mipmap-xxhdpi/ic_launcher_background.png
  ./android/res/mipmap-xxhdpi/ic_launcher_foreground.png
  ./android/res/mipmap-xxhdpi/ic_launcher_round.png
  ./android/res/mipmap-xxxhdpi
  ./android/res/mipmap-xxxhdpi/ic_launcher.png
  ./android/res/mipmap-xxxhdpi/ic_launcher_background.png
  ./android/res/mipmap-xxxhdpi/ic_launcher_foreground.png
  ./android/res/mipmap-xxxhdpi/ic_launcher_round.png  
  ./android/res/values
  ./android/res/values/strings.xml
  ./android/res/values/styles.xml
  ./android/res/values-v21
  ./android/res/values-v21/styles.xml
  ./android/res/xml
  ./android/res/xml/backup_rules.xml
  ./android/src
  ./android/src/chess
  ./android/src/chess/android
  ./android/src/chess/android/.AndroidRhinoContext.java
  ./android/src/chess/android/AndroidLauncher.java
  ./android/AndroidManifest.xml
  ./android/build.gradle
  ./android/ic_launcher-web.png
  ./android/proguard-rules.pro
  ./core
  ./core/src
  ./core/src/chess
  ./core/src/chess/board
  ./core/src/chess/board/ChessBoard.java
  ./core/src/chess/game
  ./core/src/chess/game/GameLogic.java
  ./core/src/chess/moves
  ./core/src/chess/moves/Move.java
  ./core/src/chess/pieces
  ./core/src/chess/pieces/Bishop.java
  ./core/src/chess/pieces/King.java
  ./core/src/chess/pieces/Knight.java
  ./core/src/chess/pieces/Pawn.java
  ./core/src/chess/pieces/Piece.java
  ./core/src/chess/pieces/Queen.java
  ./core/src/chess/pieces/Rook.java
  ./core/src/chess/ui
  ./core/src/chess/ui/BoardRenderer.java
  ./core/src/chess/Main.java
  ./core/src/build.gradle
  ./gradle
  ./gradle/wrapper
  ./gradle/wrapper/gradle-wrapper.jar
  ./gradle/wrapper/gradle-wrapper.properties
  ./tests
  ./tests/build.gradle
  ./tests/ChessBoardTest.java
  ./.gitignore
  ./build.gradle
  ./gradle.properties
  ./gradlew
  ./gradlew.bat
  ./README.md
  ./settings.gradle
 ```

---
