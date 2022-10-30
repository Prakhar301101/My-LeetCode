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
    public boolean findTarget(TreeNode root, int k) {
         List<Integer> a=new ArrayList<>();
        a=dfs(root);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.size();i++){
            int target=k-a.get(i);
            if(map.containsKey(target)){
                return true;
            }
            map.put(a.get(i),i);
        }
        return false;
    }
    static List<Integer> dfs(TreeNode root){
        List<Integer> a=new ArrayList<>();
        if(root==null){
            return a;
        }
        a.add(root.val);
        a.addAll(dfs(root.left));
        a.addAll(dfs(root.right));
        return a;
    }
}