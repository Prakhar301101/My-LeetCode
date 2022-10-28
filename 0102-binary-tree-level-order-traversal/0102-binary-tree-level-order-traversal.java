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
        public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> fin=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
         if(root==null){
             return fin;
         }
         q.add(root);
          while(!q.isEmpty()){
              int t=q.size();
              List<Integer> sub=new ArrayList<>();
              for(int i=0;i<t;i++){
                  TreeNode curr=q.poll();
                  sub.add(curr.val);
                  if(curr.left!=null) q.add(curr.left);
                  if(curr.right!=null) q.add(curr.right);
              }
              fin.add(sub);
          }
          return fin;  
    }
}