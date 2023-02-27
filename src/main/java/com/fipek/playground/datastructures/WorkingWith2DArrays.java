package com.fipek.playground.datastructures;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        //Example of The Tic-Tac-Toe game

        char[][] board = new char[3][3];

        //initialize
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        //or

        char[][] boardTwo = new char[][]{
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'}
        };

        //We must use deepToString because this is 2D array
        System.out.println(Arrays.deepToString(board));

        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';

        System.out.println(Arrays.deepToString(board));
    }

}
