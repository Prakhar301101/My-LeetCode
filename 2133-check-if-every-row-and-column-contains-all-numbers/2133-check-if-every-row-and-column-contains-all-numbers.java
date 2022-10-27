class Solution {
    public boolean checkValid(int[][] matrix) {
       for(int i=0;i<matrix.length;i++){
           HashSet<Integer> r=new HashSet<>();
           HashSet<Integer> c=new HashSet<>();
        for(int j=0;j<matrix[i].length;j++){
            if(!r.add(matrix[i][j])||!c.add(matrix[j][i])){
                return false;
            }
        }
       }
        return true;
    }
}