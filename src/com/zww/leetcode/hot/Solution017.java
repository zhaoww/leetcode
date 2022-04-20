package com.zww.leetcode.hot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17. 电话号码的字母组合
 *
 * @author weiwei.zhao
 * @since 2022/04/20
 */
public class Solution017 {
    public static Map<Character, String> map = new HashMap() {
        {
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }
    };


    public List<String> letterCombinations(String digits) {
        List<String> resList = new ArrayList<>();
        if (digits.equals("")) return new ArrayList<>();
        backtrack(resList, digits, 0, new StringBuilder());
        return resList;
    }

    /**
     * 回溯
     *
     * @param resList
     * @param digits
     * @param index
     * @param temp
     */
    public void backtrack(List<String> resList, String digits, int index, StringBuilder temp) {
        if (index == digits.length()) {
            resList.add(temp.toString());
            return;
        }
        char ch = digits.charAt(index);
        String str = map.get(ch);
        for (int i = 0; i < str.length(); i++) {
            temp.append(str.charAt(i));
            backtrack(resList, digits, index + 1, temp);
            // 回溯一位
            temp.deleteCharAt(temp.length() - 1);
        }
    }

    public static void main(String[] args) {
        new Solution017().letterCombinations("23");
    }
}
