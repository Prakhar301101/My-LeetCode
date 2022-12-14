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
    public int findBottomLeftValue(TreeNode root) {
    Queue<TreeNode> q=new ArrayDeque<>();
        q.add(root);
        int ans=0;
        while(!q.isEmpty())
        {
            int t=q.size();
            for(int i=0;i<t;i++)
            {
                TreeNode curr=q.poll();
                if(i==0)
                {
                   ans=curr.val ;
                }
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
        }
        return ans;
        
        
    }
}