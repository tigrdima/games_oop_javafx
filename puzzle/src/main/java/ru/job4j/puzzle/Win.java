package ru.job4j.puzzle;

public class Win {

    public static boolean check(int[][] board) {
        return checkRow(board) || checkCell(board);

    }

    public static boolean checkRow(int[][] board) {
       int b = 1;

        for (int[] ints : board) {
            for (int cell = 0; cell < ints.length - 1; cell++) {
                if (ints[cell] == 1 && ints[cell + 1] == 1) {
                    b++;
                }
            }
        }
        return b == board.length;
    }

    public static boolean checkCell(int[][] board) {
        int b = 1;

        for (int row = 0; row < board.length - 1; row++) {
            for (int cell = 0; cell < board[row].length; cell++) {
                if (board[row][cell] == 1 && board[row + 1][cell] == 1) {
                    b++;
                }
            }
        }
        return b == board[0].length;
    }
}
