package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.NestedInteger;

import java.util.Iterator;
import java.util.List;

/**
 * 341. 扁平化嵌套列表迭代器
 *
 * @author weiwei.zhao
 * @since 2022/07/19
 */
public class Solution0341 implements Iterator<Integer> {
    private List<NestedInteger> nestedList;

    public Solution0341(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
    }

    @Override
    public Integer next() {
        return hasNext() ? nestedList.remove(0).getInteger() : null;
    }

    @Override
    public boolean hasNext() {
        while (!nestedList.isEmpty() && !nestedList.get(0).isInteger()) {
            List<NestedInteger> list = nestedList.remove(0).getList();
            for (int i = list.size() - 1; i >= 0; i--) {
                nestedList.add(0, list.get(i));
            }
        }
        return !nestedList.isEmpty();
    }

}
