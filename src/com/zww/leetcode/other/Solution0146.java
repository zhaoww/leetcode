package com.zww.leetcode.other;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * 146. LRU »º´æ
 *
 * @author weiwei.zhao
 * @since 2022/07/08
 */
public class Solution0146 {
    int capacity;
    Map<Integer, Integer> cache = new HashMap<>();
    public Solution0146(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
//        if ()
        return 1;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {

        }else {
            cache.put(key, value);
        }
    }


    public static void main(String[] args) {

    }


}
