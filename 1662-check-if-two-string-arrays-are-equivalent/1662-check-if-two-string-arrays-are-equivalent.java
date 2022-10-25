class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String ans1="",ans2="";
        for(String i:word1){
            ans1+=i;
        }
        for(String i:word2){
            ans2+=i;
        }
        return ans1.equals(ans2);
    }
}