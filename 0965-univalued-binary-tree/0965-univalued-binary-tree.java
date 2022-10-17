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
    int c;
    boolean flag=true;
    
    public boolean isUnivalTree(TreeNode root) {
//         if(root==null){
//             return true;
//         }
//         List<Integer> t=new ArrayList<>();
//         t=preOrder(root);
//         for(int i=0;i<t.size()-1;i++){
//             if(t.get(i)!=t.get(i+1)){
//                 return false;
//             }
//         }
//         return true;
        
        
//     }
//     static List<Integer> preOrder(TreeNode root){
//         List<Integer> a=new ArrayList<>();
//         if(root==null){
//             return a;
//         }
//         a.add(root.val);
//         a.addAll(preOrder(root.left));
//         a.addAll(preOrder(root.right));
//         return a;
//     } 
        
    c=root.val;
    check(root);
     return flag;   
}
     void check(TreeNode root){
        if(root==null){
            return;
        }
        if(c!=root.val)
            flag=false;
        check(root.left);
        check(root.right);
    }
    
    
}