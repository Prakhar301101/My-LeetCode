class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> fin=new ArrayList<>();
        int t=1;
        
        while(t<=n){
            List<Integer> sub=new ArrayList<>();
            int e=t,p=0;
            if(e==1){
            sub.add(1);
            fin.add(sub);
                t++;
            }
           else if(e==2){
                sub.add(1);sub.add(1);
                fin.add(sub);
                t++;
            }
            else{
                sub.add(1);--e;
                List<Integer> d=new ArrayList<>();
                d=fin.get(t-2);
                while(e-->1){
                    int a=d.get(p)+d.get(p+1);
                    sub.add(a);
                    p++;
                }
                sub.add(1);
                fin.add(sub);
                t++;
            }
        }
        return fin;
    }
}