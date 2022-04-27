package com.zww.leetcode.hot;

import java.util.Stack;

/**
 * 155. 最小栈
 *
 * @author weiwei.zhao
 * @since 2022/04/27
 */
public class Solution155 {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public Solution155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        minStack.push(minStack.empty() ? val : Math.min(val, minStack.peek()));
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        Solution155 minStack = new Solution155();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.getMin();   //--> 返回 -3.
        minStack.pop();
        minStack.top();      //--> 返回 0.
        minStack.getMin();   //--> 返回 -2.
    }


    /**
     * 方法二 不利用辅助栈， 往栈里插入二元组 0 元素 1 最小
     * // 数组栈, [当前值, 当前最小值]
     *     private Stack<int[]> stack = new Stack<>();
     *
     *     public MinStack() {
     *
     *     }
     *
     *     public void push(int x) {
     *         if (stack.isEmpty()){
     *             stack.push(new int[]{x, x});
     *         }else {
     *             stack.push(new int[]{x, Math.min(x, stack.peek()[1])});
     *         }
     *     }
     *
     *     public void pop() {
     *         stack.pop();
     *     }
     *
     *     public int top() {
     *         return stack.peek()[0];
     *     }
     *
     *     public int getMin() {
     *         return stack.peek()[1];
     *     }
     */

}
