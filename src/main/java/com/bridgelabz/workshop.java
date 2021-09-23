package com.bridgelabz;

import java.util.Scanner;

public class workshop {
    public class TicTacToe {

        public static void createEmptyBoard() {
            char[] board = new char[10];
            for (int a = 1; a < board.length; a++) {
                board[a] = ' ';
            }
        }
        static char player,computer;
        public  static char playerChoose(char CHOOSE_LETTER)
        {
            if(CHOOSE_LETTER == 'o'){
                player ='o';
                computer = 'x';
            }
            else if(CHOOSE_LETTER == 'x'){
                player ='x';
                computer = 'o';
        }
            else {
                System.out.println("enter valid character");
            }
            return player;
        }
        public static void main(String[] args) {
            System.out.println("Welcome to TIC-TAC-TOE BOARD");
            createEmptyBoard();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose a letter x or o");
            char CHOOSE_LETTER = scanner.next().charAt('o');
            playerChoose(CHOOSE_LETTER);
        }
    }
}
