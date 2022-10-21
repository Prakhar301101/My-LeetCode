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
    int ans;
    int maxlevel;
    public int deepestLeavesSum(TreeNode root) {
//         int sum=0;
//         if(root==null) return sum;
//         List<List<Integer>> a=new ArrayList<>();
//         a=bfs(root);
//         List<Integer> sub=new ArrayList<>();
//         int k=a.size()-1;
//         sub=a.get(k);
//         int p=sub.size(),i=0;
//         while(i!=p){
//             sum+=sub.get(i);
//             i++;
//         }
//         return sum;
//     }
//     public static List<List<Integer>> bfs(TreeNode root){
//         List<List<Integer>> a=new ArrayList<>();
//         if(root==null){
//             return a;
//         }
//         Queue<TreeNode> q=new LinkedList<>();
//         q.add(root);
//         while(!q.isEmpty()){
//         int l=q.size();
//          List<Integer> sub=new ArrayList<>();
//             for(int i=0;i<l;i++){
//              TreeNode cur=q.poll();
//               if(cur.left!=null) q.add(cur.left);
//               if(cur.right!=null) q.add(cur.right);  
            
//             sub.add(cur.val);                    
//             }
//             a.add(sub);
//         }
//         return a;
        
        
        if(root==null){
            return 0;
        }
        sumatlevel(root,0);
        return ans;
    }
    
    public void sumatlevel(TreeNode root,int l){
        if(root==null){
            return;
        }
        if(l>maxlevel){
            maxlevel=l;
            ans=0;
        }
        if(l==maxlevel){
            ans+=root.val;
        }
        sumatlevel(root.left,l+1);
        sumatlevel(root.right,l+1);
    }
    
}