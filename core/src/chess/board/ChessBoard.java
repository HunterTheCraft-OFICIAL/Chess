package chess.board;

import chess.pieces.*;

public class ChessBoard {
    private Piece[][] board;

    public ChessBoard() {
        board = new Piece[8][8]; // tabuleiro 8x8
        setupBoard();
    }

    private void setupBoard() {
        // Peões
        for (int col = 0; col < 8; col++) {
            board[6][col] = new Pawn("white");
            board[1][col] = new Pawn("black");
        }

        // Torres
        board[7][0] = new Rook("white");
        board[7][7] = new Rook("white");
        board[0][0] = new Rook("black");
        board[0][7] = new Rook("black");

        // Cavalos
        board[7][1] = new Knight("white");
        board[7][6] = new Knight("white");
        board[0][1] = new Knight("black");
        board[0][6] = new Knight("black");

        // Bispos
        board[7][2] = new Bishop("white");
        board[7][5] = new Bishop("white");
        board[0][2] = new Bishop("black");
        board[0][5] = new Bishop("black");

        // Rainhas
        board[7][3] = new Queen("white");
        board[0][3] = new Queen("black");

        // Reis
        board[7][4] = new King("white");
        board[0][4] = new King("black");
    }

    public Piece getPiece(int row, int col) {
        return board[row][col];
    }

    public void movePiece(int fromRow, int fromCol, int toRow, int toCol) {
        Piece piece = board[fromRow][fromCol];
        if (piece != null && piece.isValidMove(fromRow, fromCol, toRow, toCol)) {
            board[toRow][toCol] = piece;
            board[fromRow][fromCol] = null;
        }
    }
}