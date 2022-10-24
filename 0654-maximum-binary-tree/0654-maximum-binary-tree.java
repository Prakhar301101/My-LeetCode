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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       if(nums.length==0){
           return null;
       }
        int max=-1,maxi=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];maxi=i;
            }
        }
        int l[]=Arrays.copyOfRange(nums,0,maxi);
        int r[]=Arrays.copyOfRange(nums,maxi+1,nums.length);
        TreeNode root=new TreeNode(nums[maxi]);
        root.left=(constructMaximumBinaryTree(l));
        root.right=(constructMaximumBinaryTree(r));
        
        return root;
    }
}