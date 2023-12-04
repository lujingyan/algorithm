package com.example;

public class Solution1448 {
    public int goodNodes(TreeNode root){
        return countGoodNodes(root,root.val);
    }
    public int countGoodNodes(TreeNode root , int maxNumber){
        if ( root == null){
            return 0;
        }
        int count = 0;
        if (root .val >= maxNumber) {
            count = 1;
            maxNumber = root.val;
        }
        return maxNumber + countGoodNodes(root.left , maxNumber) + countGoodNodes(root.right , maxNumber);
    }
}
