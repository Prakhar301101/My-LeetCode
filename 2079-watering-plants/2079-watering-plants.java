class Solution {
    public int wateringPlants(int[] plants, int c) {
        int ans=0;int cap=c;
        for(int i=0;i<plants.length;i++){
           if(c<plants[i]){
                ans+=(2*i) ;
                c=cap;
            }
            ans+=1;
            c-=plants[i];
        }
        return ans;
    }
}