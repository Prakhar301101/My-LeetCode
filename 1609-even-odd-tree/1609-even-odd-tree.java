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
    public boolean isEvenOddTree(TreeNode root) {
        boolean ans=true;
        List<List<Integer>>level=new ArrayList<>();
        level=bfs(root);
        if((level.get(0).get(0))%2==0){
            ans= false;
        }
        for(int i=1;i<level.size();i++){
            List<Integer> sub=new ArrayList<>();
            sub=level.get(i);
            if(i%2!=0){
              if(sub.size()==1){
                  if(sub.get(0)%2!=0)
                    ans=false;
              }  
            for(int j=0;j<sub.size()-1;j++){
                if(sub.get(j)<=sub.get(j+1)){
                    ans= false;
                }
                 if(sub.get(j)%2!=0||sub.get(sub.size()-1)%2!=0){
                    ans=false;
                }
            }  
            }
            else {
                if(sub.size()==1){
                     if(sub.get(0)%2==0)
                      ans=false;
                }
                for(int k=0;k<sub.size()-1;k++){
                if(sub.get(k)>=sub.get(k+1)){
                         ans=false;
                }
                 if(sub.get(k)%2==0||sub.get(sub.size()-1)%2==0){
                  ans=false;
                }
            }  
            }
            }
        
            return ans;
        }
    
    static List<List<Integer>> bfs(TreeNode root){
         List<List<Integer>> fin=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<TreeNode>();
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