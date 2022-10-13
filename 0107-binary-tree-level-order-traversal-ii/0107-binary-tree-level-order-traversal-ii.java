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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> sub=new ArrayList<>();
            sub=levelOrder(root);
         List<List<Integer>> ans=new ArrayList<>();  
        int p1=0,p2=sub.size();
        while(p1<sub.size()){
            ans.add(p1,sub.get(p2-1));
            p1++;p2--;
        }
        return ans;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> fin=new ArrayList<>();
        if(root==null) return fin;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int t=q.size();
            List<Integer> sub=new ArrayList<Integer>();
            for(int i=0;i<t;i++){
               TreeNode current=q.poll();
                sub.add(current.val);
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
            }
            fin.add(sub);
        }
        return fin;
    }
    
}