package com.solution.leetcode2;

import java.util.HashSet;

/**
 * @Author dzyls
 * @Description
 * @Time 2018/12/26 16:14
 **/
public class IsValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> []col = new HashSet[9];
        HashSet<Character> []row = new HashSet[9];
        HashSet<Character> []block = new HashSet[9];
        for (int i = 0; i < 9; i++) {
            col[i] = new HashSet<>();
            row[i] = new HashSet<>();
            block[i] = new HashSet<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.'){
                    continue;
                }
                boolean isAdd = col[i].add(board[i][j]);
                if (!isAdd){
                    return false;
                }
                isAdd = row[j].add(board[i][j]);
                if (!isAdd){
                    return false;
                }

                isAdd = block[(i/3)*3+(j/3)].add(board[i][j]);
                if (isAdd){
                    return false;
                }
            }
        }
        return true;
    }


}
