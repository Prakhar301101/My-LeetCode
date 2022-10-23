class Solution {
    public boolean isAnagram(String s, String t) {
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();
        if(a.length!=b.length){
            return false;
        }
        Arrays.sort(a);Arrays.sort(b);
        for(int i=0;i<a.length;i++){
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