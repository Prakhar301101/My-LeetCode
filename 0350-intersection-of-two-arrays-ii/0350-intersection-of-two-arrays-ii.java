class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> a=new ArrayList<>();
        Arrays.sort(nums1);Arrays.sort(nums2);
        int f1[]=new int[1001];
        int f2[]=new int[1001];
        for(int i:nums1){
            f1[i]++;
        }
        for(int i:nums2){
            f2[i]++;
        }
        for(int i=0;i<1001;i++){
            if(f1[i]>0&&f2[i]>0){
                int t=Math.min(f1[i],f2[i]);
                while(t-->0){
                    a.add(i);
                }
            }
        }
         int[] arr = new int[a.size()];
          for(int i=0;i<a.size();i++){
              arr[i]=a.get(i);
          }
        return arr;
    }
}

 