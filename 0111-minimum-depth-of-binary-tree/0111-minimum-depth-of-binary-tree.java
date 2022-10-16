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
        
//         dfs
        // int depthL=minDepth(root.left);
        // int depthR=minDepth(root.right);
        // depthL=depthL==0?depthR:depthL;
        // depthR=depthR==0?depthL:depthR;
        // return 1+Math.min(depthL,depthR);
        
//         bfs
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int count=1;
        while(!q.isEmpty()){
            int t=q.size();
            for(int i=0;i<t;i++){
                TreeNode c=q.poll();
               if(c.left==null && c.right==null) return count;
                if(c.left!=null) q.add(c.left);
                if(c.right!=null) q.add(c.right);
            }
            count++;
        }
        return count;
    }
}