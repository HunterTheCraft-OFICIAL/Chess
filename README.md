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

core/src/Chess/
├── board/
│   └── ChessBoard.java
├── pieces/
│   ├── Piece.java
│   ├── Pawn.java
│   ├── Rook.java
│   ├── Knight.java
│   ├── Bishop.java
│   ├── Queen.java
│   └── King.java
├── moves/
│   └── Move.java
├── game/
│   └── GameLogic.java
└── ui/
    └── BoardRenderer.java

---

