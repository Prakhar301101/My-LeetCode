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
    public int kthSmallest(TreeNode root, int k) {
          List<Integer> a=new ArrayList<>();
            a=inorder(root);
            return a.get(k-1);
    }
    
    static List<Integer> inorder(TreeNode root){
        List<Integer> a=new ArrayList<>();
        if(root==null){
            return a;
        }
        a.addAll(inorder(root.left));
        a.add(root.val);
        a.addAll(inorder(root.right));
        return a;
    }
}