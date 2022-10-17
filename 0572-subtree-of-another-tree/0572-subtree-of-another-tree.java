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
    boolean ans;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if(root==null&&subRoot!=null||root!=null&&subRoot==null){
          return false;
      }
        if(root==null&&subRoot==null){
            return true;
        }
        if(root.val==subRoot.val){
            ans=isidentical(root.left,subRoot.left);
            ans&=isidentical(root.right,subRoot.right);
        }
         return ans||isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    
    public static boolean isidentical(TreeNode r1,TreeNode r2){
        if(r1==null&&r2==null)
            return true;
        if(r1==null||r2==null)
            return false;
        if(r1.val!=r2.val){
            return false;
        }
        return isidentical(r1.left,r2.left)&&isidentical(r1.right,r2.right);
    }
}