package org.example;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

/*
- Given the root of a binary search tree (BST) with duplicates,
  return all the mode(s) (i.e., the most frequently occurred element) in it.
- If the tree has more than one mode, return them in any order.
* A mode is a value that has the maximum frequency. Note that there could be multiple modes

- Assume a BST is defined as follows:
  The left subtree of a node contains only nodes with keys less than or equal to the node's key.
  The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
  Both the left and right subtrees must also be binary search trees.
*/

// Given a TreeNode of a binary search tree (BST)
public class treeNode {
    int nodeVal;
    treeNode left;
    treeNode right;

    public treeNode(int nodeVal) {
        this.nodeVal = nodeVal;
    }

    public treeNode(int nodeVal, treeNode left, treeNode right) {
        this.nodeVal = nodeVal;
        this.left = left;
        this.right = right;
    }

    public treeNode() {
    }
}
