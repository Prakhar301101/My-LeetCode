class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int e=row(matrix,target);
        System.out.println(e);
        if(e==-1){
            return false;
        }
        if(matrix[e][0]==target){
            return true;
        }
        int p1=0,p2=matrix[e].length-1;
        while(p1<=p2){
            int mid=p1+(p2-p1)/2;
            if(matrix[e][mid]==target){
                return true;
            }
            else if(matrix[e][mid]<target){
                p1=mid+1;
            }
            else p2=mid-1;
        }
        return false;
    }
    
    static int row(int[][] a,int t){
        int r=0;
        for(int i=0;i<a.length;i++){
            if(a[i][0]<=t){
                r=i;
            }
        }
        return r;
    }
}