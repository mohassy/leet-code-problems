package org.example;

import java.util.*;

public class ValidSudoku {
    public static void main(String[] args) {
        ValidSudoku validSudoku = new ValidSudoku();
        char[][] board =  new char[][]{
                {'8','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(validSudoku.isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer, Set<Character>> rowMap = new HashMap<>();
        HashMap<Integer, Set<Character>> colMap = new HashMap<>();
        HashMap<String, Set<Character>> squareMap = new HashMap<>();
        int square_row;
        for (int i = 0; i < board.length; i++) {
            square_row = i/3;
            for (int j = 0; j < board.length; j++) {
                String square_key = square_row + " " + j/3;
                if(board[i][j] == '.')
                    continue;
                if(rowMap.get(i) == null)
                    rowMap.put(i, new HashSet<>());
                if(colMap.get(j) == null)
                    colMap.put(j, new HashSet<>());
                if(squareMap.get(square_key) == null)
                    squareMap.put(square_key, new HashSet<>());
                if(!rowMap.get(i).add(board[i][j]) || !colMap.get(j).add(board[i][j]) || !squareMap.get(square_key).add(board[i][j]))
                    return false;
            }
        }
        return true;
    }
}
