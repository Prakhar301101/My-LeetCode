class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int a[]=new int[m+n];
        int p1=0,p2=0;
        while(p1<(nums1.length-n)&&p2<n){
          if(nums1[p1]<=nums2[p2]){
              a[i]=nums1[p1];
              p1++;i++;
          }
            else{
                a[i]=nums2[p2];
                p2++;i++;
            }
        }
        while(p1<nums1.length-n){
            a[i]=nums1[p1];
            i++;p1++;
        }
        while(p2<nums2.length){
            a[i]=nums2[p2];
            i++;p2++;
        }
        for(int j=0;j<nums1.length;j++){
            nums1[j]=a[j];
        }
    }
}