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
import java.util.*;
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int f=0;
         List<List<Integer>> fin=new LinkedList<>();
        if(root==null) return fin;
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        q.add(root);
        while(!q.isEmpty()){
            int t=q.size();
            LinkedList<Integer> s=new LinkedList<>();
            if(f==0){
            for(int i=0;i<t;i++){
               TreeNode current=q.poll();
                s.addLast(current.val);
                 if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
                 f=1;
            }
            }
            else{
                for(int i=0;i<t;i++){
               TreeNode current=q.poll();
                s.addFirst(current.val); 
                if(current.left!=null) q.add(current.left);
                if(current.right!=null) q.add(current.right);
                    f=0;
            }
            }
            fin.add(s);
        }
        return fin;
    }
}