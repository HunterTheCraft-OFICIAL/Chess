package chess;

import chess.board.ChessBoard;

public class Main {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        System.out.println("Tabuleiro inicial pronto!");
        board.printBoard(); // imprime o tabuleiro no console
    }
}