class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int s=l1+l2;
        int f[]=new int[s];
        f=merge(nums1,nums2);
        double median=0;
        if(s%2==0){
            median=(double)(f[s/2]+f[s/2-1])/2;
        }
        else{
            median=(f[s/2]);
        }
        return median;
    }
    public static int[] merge(int a[],int b[]){
           int l1=a.length;
           int l2=b.length;
           int s=l1+l2;
            int ans[]=new int[s];
        int p1=0,p2=0,i=0;
        while(p1!=l1&&p2!=l2){
            if(a[p1]<=b[p2]){
                ans[i]=a[p1];
                i++;p1++;
            }
            else if(a[p1]>b[p2]){
                ans[i]=b[p2];
                i++;p2++;
            }
        }
        while(p1!=a.length){
            ans[i]=a[p1];
            i++;p1++;
        }
        while(p2!=b.length){
            ans[i]=b[p2];
            i++;p2++;
        }
        return ans;
}
}