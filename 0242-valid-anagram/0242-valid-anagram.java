class Solution {
    public boolean isAnagram(String s, String t) {
        int a[]=new int[26];
        int b[]=new int[26];
        a=freq(s);
        b=freq(t);
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
     static int[] freq(String s){
        int f[]=new int[26];
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'a';
            f[c]++;
        }
        return f;
    }
}