class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int ans[]=new int[nums.length]; 
        int p1=0,p2=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                ans[p1++]=nums[i];
            }
            if(nums[nums.length-i-1]>pivot){
                ans[p2--]=nums[nums.length-i-1];
            }
        }                                            
         while(p1<=p2){
             ans[p1++]=pivot;
         }                                           
       // List<Integer> l=new ArrayList<>();
       //   List<Integer> m=new ArrayList<>();
       //  List<Integer>r=new ArrayList<>();
       //  for(int i:nums){
       //      if(i<pivot){
       //          l.add(i);
       //      }
       //      else if(i==pivot){
       //          m.add(i);
       //      }
       //      else r.add(i);
       //  }
       //  l.addAll(m);
       //  l.addAll(r);
       //  int p=0;
       //  for(int i:l){
       //      ans[p]=i;
       //      p++;
       //  }
        return ans;
    }
}