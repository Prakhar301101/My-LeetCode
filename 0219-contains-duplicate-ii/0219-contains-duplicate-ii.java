class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean ans=false;
        int p=0;
         HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                return true;
            }
            else{
                s.add(nums[i]);
                p++;
            }
            if(p>k){
                s.remove(nums[i-k]);
            }
        }
         return false;   
    }
}