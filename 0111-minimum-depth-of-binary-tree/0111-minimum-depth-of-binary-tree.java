/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int depthL=minDepth(root.left);
        int depthR=minDepth(root.right);
        depthL=depthL==0?depthR:depthL;
        depthR=depthR==0?depthL:depthR;
        return 1+Math.min(depthL,depthR);
    }
}