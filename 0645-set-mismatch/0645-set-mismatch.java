class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]=new int[2];
        int f[]=new int[nums.length];
        Arrays.fill(f,0);
        for(int i:nums){
            f[i-1]++;
        }
        for(int i=0;i<f.length;i++){
            if(f[i]==2){
                ans[0]=i+1;
            }
            else if(f[i]==0){
                ans[1]=i+1;
            }
        }
        return ans;
    }
}