package com.bridgelabz;

public class workshop {
    public class TicTacToe {

        public static void createEmptyBoard() {
            char[] board = new char[10];
            for (int a = 1; a < board.length; a++) {
                board[a] = ' ';
            }
        }

        public static void main(String[] args) {
            System.out.println("Welcome to TIC-TAC-TOE BOARD");
            createEmptyBoard();
        }
    }
}
