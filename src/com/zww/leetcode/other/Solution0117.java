package com.zww.leetcode.other;

import com.zww.leetcode.common.struct.Node2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 116. 填充每个节点的下一个右侧节点指针
 *
 * @author 半山兄
 * @since 2022/07/06
 */
public class Solution0117 {
    public Node2 connect(Node2 root) {
        if (root == null) return null;
        Queue<Node2> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            while (cnt > 0) {
                Node2 node = queue.poll();
                // 连接
                if (cnt > 1) {
                    node.next = queue.peek();
                }

                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                cnt--;
            }
        }
        return root;
    }
}
