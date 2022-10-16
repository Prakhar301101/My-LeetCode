class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='0'&&s.charAt(i)<='9'){
                s1+=s.charAt(i);
            }
        }
        int p1=0,p2=s1.length()-1;
        while(p1<p2){
            if(s1.charAt(p1)==s1.charAt(p2)){
                p1++;p2--;
            }
            else return false;
        }
        return true;
    }
}