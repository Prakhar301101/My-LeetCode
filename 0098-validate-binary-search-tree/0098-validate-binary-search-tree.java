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
    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
       List<Integer> a=new ArrayList<Integer>();
       a=dfs(root);
        for(int i=0;i<a.size()-1;i++){
            if(a.get(i+1)<=a.get(i)){
                return false;
            }
        }
        return true;
        
    }
    public static List<Integer> dfs(TreeNode root){
        List<Integer> a=new ArrayList<Integer>();
        if(root==null){
            return a;
        }
        a.addAll(dfs(root.left));
        a.add(root.val);
        a.addAll(dfs(root.right));
        return a;
    }
}