package com.zww.leetcode.offer;

import java.util.Arrays;

/**
 * 剑指 Offer 33. 二叉搜索树的后序遍历序列
 *
 * @author weiwei.zhao
 * @since 2022/06/21
 */
public class Solution033 {
    public boolean verifyPostorder(int[] postorder) {
        int len = postorder.length;
        if (len == 0) return true;
        int root = postorder[len - 1];
        int index = -1;
        for (int i = 0; i < len - 1; i++) {
            if (root < postorder[i]) {
                index = i;
                break;
            }
        }
        int[] left;
        int[] right;
        if (index == -1) {
            left = Arrays.copyOfRange(postorder, 0, len - 1);
            right = new int[0];
        } else {
            left = Arrays.copyOfRange(postorder, 0, index);
            right = Arrays.copyOfRange(postorder, index, len - 1);
        }

        // 左子树小于root
        for (int i = 0, leni = left.length; i < leni; i++) {
            if (root < left[i]) return false;
        }
        // 右子树大于root
        for (int i = 0, lenj = right.length; i < lenj; i++) {
            if (root > right[i]) return false;
        }
        return verifyPostorder(left) && verifyPostorder(right);
    }

    public static void main(String[] args) {
        new Solution033().verifyPostorder(new int[]{1, 2, 5, 10, 6, 9, 4, 3});
    }
}
