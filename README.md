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
  ./.github/workflows
  ./.github/workflows/build.yml
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
  ./gradle
  ./gradle/wrapper
  ./gradle/wrapper/gradle-wrapper.jar
  ./gradle/wrapper/gradle-wrapper.properties
  ./tests
  ./tests/ChessBoardTest.java
  ./.gitignore
  ./build.gradle
  ./README.md
 ```

---