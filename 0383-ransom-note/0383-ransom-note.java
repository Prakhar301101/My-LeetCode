class Solution {
    public boolean canConstruct(String r, String m) {
       char c[]=r.toCharArray(); 
        
     HashMap<Character,Integer> r1=new HashMap<>();
     HashMap<Character,Integer> m1=new HashMap<>();
        for(int i=0;i<r.length();i++){
            if(r1.containsKey(r.charAt(i))){
                r1.put(r.charAt(i),r1.get(r.charAt(i))+1);
            }
            else{
                r1.put(r.charAt(i),1);
            }
        }
        for(int i=0;i<m.length();i++){
            if(m1.containsKey(m.charAt(i))){
                m1.put(m.charAt(i),m1.get(m.charAt(i))+1);
            }
            else{
                m1.put(m.charAt(i),1);
            }
        }
        
        for(char a:c){
            if(m1.containsKey(a)==false||r1.get(a)>m1.get(a)){
                return false;
            }
        }
        return true;
        
        
    }  
}