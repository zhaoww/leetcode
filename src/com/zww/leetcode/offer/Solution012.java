package com.zww.leetcode.offer;

/**
 * 剑指 Offer 12. 矩阵中的路径
 *
 * @author 半山兄
 * @since 2022/05/31
 */
public class Solution012 {
    int lenI = 0;
    int lenJ = 0;

    public boolean exist(char[][] board, String word) {
        lenI = board.length;
        lenJ = board[0].length;
        // 任意节点开始
        for (int i = 0; i < lenI; i++) {
            for (int j = 0; j < lenJ; j++) {
                if (backtrace(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean backtrace(char[][] board, String word, int i, int j, int k) {
        if (i >= lenI || i < 0 || j >= lenJ || j < 0 || board[i][j] != word.charAt(k)) return false;
        if (k == word.length() - 1) return true;

        board[i][j] = ' ';
        //右 下 左 上
        boolean res = backtrace(board, word, i + 1, j, k + 1) || backtrace(board, word, i, j + 1, k + 1)
                || backtrace(board, word, i - 1, j, k + 1) || backtrace(board, word, i, j - 1, k + 1);
        board[i][j] = word.charAt(k);
        return res;
    }
}
