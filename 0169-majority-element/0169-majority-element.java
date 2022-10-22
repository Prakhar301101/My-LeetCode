class Solution {
    public int majorityElement(int[] nums) {
        int s=nums.length;int ans=0;
        HashMap<Integer,Integer> c=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(c.containsKey(nums[i])){
                c.put(nums[i],c.get(nums[i])+1);
            }
            else{
                c.put(nums[i],1);
            }
        }
           for(int j:nums){
                if(c.get(j)>s/2){
                    ans=j;
                }
               }
        return ans;
    }
}