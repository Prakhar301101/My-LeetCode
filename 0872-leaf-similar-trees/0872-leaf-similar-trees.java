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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> t1=new ArrayList<>();
        ArrayList<Integer> t2=new ArrayList<>();
        t1=leaf(root1);
        t2=leaf(root2);
        if(t1.size()!=t2.size()) return false;
        for(int i=0;i<t1.size();i++){
            if(t1.get(i)!=t2.get(i))
                return false;
        }
        return true;

    }
    static ArrayList<Integer> leaf(TreeNode root){
      ArrayList<Integer> a=new ArrayList<>();
        if(root==null){
            return a;
        }
        if(root.left==null&&root.right==null){
            a.add(root.val);
        }
        a.addAll(leaf(root.left));
        a.addAll(leaf(root.right));
        return a;
    }
}