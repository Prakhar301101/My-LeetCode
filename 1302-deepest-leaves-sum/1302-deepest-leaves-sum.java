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
    public int deepestLeavesSum(TreeNode root) {
        int sum=0;
        if(root==null) return sum;
        List<List<Integer>> a=new ArrayList<>();
        a=bfs(root);
        List<Integer> sub=new ArrayList<>();
        int k=a.size()-1;
        sub=a.get(k);
        int p=sub.size(),i=0;
        while(i!=p){
            sum+=sub.get(i);
            i++;
        }
        return sum;
    }
    public static List<List<Integer>> bfs(TreeNode root){
        List<List<Integer>> a=new ArrayList<>();
        if(root==null){
            return a;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
        int l=q.size();
         List<Integer> sub=new ArrayList<>();
            for(int i=0;i<l;i++){
             TreeNode cur=q.poll();
              if(cur.left!=null) q.add(cur.left);
              if(cur.right!=null) q.add(cur.right);  
            
            sub.add(cur.val);                    
            }
            a.add(sub);
        }
        return a;
    }
}