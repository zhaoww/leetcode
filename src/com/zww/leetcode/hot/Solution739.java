package com.zww.leetcode.hot;

import java.util.Stack;

/**
 * 739. 每日温度
 *
 * @author weiwei.zhao
 * @since 2022/05/05
 */
public class Solution739 {
    /**
     * 暴力解法
     *
     * @param temperatures
     * @return
     */
    public int[] dailyTemperatures2(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[i] < temperatures[j]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }
        return ans;
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                int pre = stack.pop();
                ans[pre] = i - pre;
            }
            stack.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        new Solution739().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    }
}
