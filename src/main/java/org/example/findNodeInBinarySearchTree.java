package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Approach 1: Count Frequency With Hash Map (DFS)

/**
 Algorithm
 1. Initialize a hash map counter.
 2. Create a function dfs(node, counter):
 - If node is null, immediately exit the function.
 - Increment the frequency of node.val in counter.
 - Call dfs on both children with dfs(node.left, counter) and dfs(node.right, counter).
 3. Call dfs(root, counter).
 4. Find the maximum value in counter as maxFreq.
 5. Initialize the answer list ans.
 6. Iterate over all key-value pairs in counter. If the value is equal to maxFreq, add the key to ans.
 7. Return ans.
 */

public class findNodeInBinarySearchTree {
    public List<Integer> findNode(treeNode root) {
        Map<Integer, Integer> counter = new HashMap<>();
        dfs(root, counter);
        int maxFreq = 0;
        for(int key: counter.keySet()) {
            maxFreq = Math.max(maxFreq, counter.get(key));
        }

        List<Integer> ans = new ArrayList<>();
        for (int key: counter.keySet()) {
            if (counter.get(key) == maxFreq) {
                ans.add(key);
            }
        }
        return ans;
    }

    public void dfs(treeNode node, Map<Integer, Integer> counter) {
        if (node == null) {
            return;
        }
        // Add value from TreeNode as key and count as value to HashMap
        counter.put(node.nodeVal, counter.getOrDefault(node.nodeVal, 0) +1);
        dfs(node.left, counter);
        dfs(node.right, counter);
    }
}