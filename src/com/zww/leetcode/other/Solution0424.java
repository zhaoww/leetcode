package com.zww.leetcode.other;

/**
 * 424. 替换后的最长重复字符
 *
 * @author weiwei.zhao
 * @since 2022/05/07
 */
public class Solution0424 {
    /**
     * 滑动窗口
     *
     * @param s
     * @param k
     * @return
     */
    public int characterReplacement(String s, int k) {
        int[] nums = new int[26];
        int maxn = 0, left = 0, right = 0;
        while (right < s.length()) {
            nums[s.charAt(right) - 'A']++;
            maxn = Math.max(maxn, nums[s.charAt(right) - 'A']);
            //求窗口中曾出现某字母的最大次数
            //计算某字母出现在某窗口中的最大次数，窗口长度只能增大或者不变
            //这样做的意义：我们求的是最长，如果找不到更长的维持长度不变返回结果不受影响
            if (right - left + 1 - maxn > k) {
                nums[s.charAt(left) - 'A']--;
                left++;
            }
            right++;
        }
        return right - left;
    }

    public static void main(String[] args) {
        new Solution0424().characterReplacement("CABABB", 2);
    }
}
