class Solution {
    public boolean checkIfPangram(String s) {
        int frq[]=new int[26];
        Arrays.fill(frq,0);
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'a';
            frq[a]++;
        }
        for(int i:frq){
            if(i==0)
                return false;
        }
        return true;
    }
}