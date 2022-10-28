class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       List<Integer> l=new ArrayList<>();
         List<Integer> m=new ArrayList<>();
        List<Integer>r=new ArrayList<>();
        for(int i:nums){
            if(i<pivot){
                l.add(i);
            }
            else if(i==pivot){
                m.add(i);
            }
            else r.add(i);
        }
        l.addAll(m);
        l.addAll(r);
        int ans[]=new int[nums.length];
        int p=0;
        for(int i:l){
            ans[p]=i;
            p++;
        }
        return ans;
    }
}