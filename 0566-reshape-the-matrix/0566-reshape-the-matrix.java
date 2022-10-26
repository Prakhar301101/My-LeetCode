class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int mr=mat.length;
        int mc=mat[0].length;
        int el=mr*mc;
        if((r*c)!=el){
            return mat;
        }
            int p1=0,p2=0;
            int ans[][]=new int[r][c];
            for(int i=0;i<r;i++){
                for(int j=0;j<c;j++){
                    ans[i][j]=mat[p1][p2];
                    p2++;
                    if(p2>(mc-1)){
                        p2=0;
                        p1++;
                    }                        
                }
            }
        return ans;
    }
}