package ru.job4j.puzzle;

public class Win {

    public static boolean check(int[][] board) {
        boolean rsl = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] == 1 && (checkRow(board, j) || (checkCell(board, j)))) {
                    rsl = true;
                    break;
                }
            }
        }
        return rsl;
    }

    public static boolean checkRow(int[][] board, int row) {
        boolean rsl = true;

        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }

    public static boolean checkCell(int[][] board, int cell) {
        boolean rsl = true;

        for (int row = 0; row < board[cell].length; row++) {
            if (board[row][cell] != 1) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
