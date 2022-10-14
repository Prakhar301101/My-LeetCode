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
    public List<Integer> rightSideView(TreeNode root) {
         List<List<Integer>> t=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        t=bfs(root);
        for(int i=0;i<t.size();i++){
            List<Integer> sub=new ArrayList<>();
            sub=t.get(i);
            ans.add(sub.get(sub.size()-1));
        }
        return ans;
    }
    public static List<List<Integer>> bfs(TreeNode root){
        List<List<Integer>> fin=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null){
            return fin;
        }
        q.add(root);
        while(!q.isEmpty()){
            int t=q.size();
            List<Integer> sub=new ArrayList<>();
            for(int i=0;i<t;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
                sub.add(curr.val);
            }
            fin.add(sub);
        }
        return fin;
    }
}