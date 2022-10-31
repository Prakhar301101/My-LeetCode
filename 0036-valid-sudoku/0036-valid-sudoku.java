class Solution {
    public boolean isValidSudoku(char[][] m) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
              char c=m[i][j];
                if(c!='.'){
                    if(!set.add(""+c+" row "+i)||!set.add(""+c+" col "+j)){
                        return false;
                    }
                    if(!set.add(""+"box "+(i/3)+(j/3)+c)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}