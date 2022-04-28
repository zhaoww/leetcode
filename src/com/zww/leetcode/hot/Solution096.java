package com.zww.leetcode.hot;

import java.util.HashMap;
import java.util.Map;

/**
 * 96. 不同的二叉搜索树
 *
 * @author weiwei.zhao
 * @since 2022/04/24
 */
public class Solution096 {
    // 加入缓存
    Map<Integer, Integer> map = new HashMap<>();

    public int numTrees(int n) {
        if (n < 2) return 1;
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            // 左子树的种类* 右子树的种类
            ans += numTrees(i - 1) * numTrees(n - i);
        }
        map.put(n, ans);
        return ans;
    }

    public static void main(String[] args) {
        new Solution096().numTrees(3);
    }
}
