class Solution {
    public int maxSubArray(int[] nums) {
        int maxsumcurr=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxsumcurr+=nums[i];
            if(maxsumcurr>maxsum){
                maxsum=maxsumcurr;
            }
            if(maxsumcurr<0){
                maxsumcurr=0;
            }
        }
        return maxsum;
    }
}