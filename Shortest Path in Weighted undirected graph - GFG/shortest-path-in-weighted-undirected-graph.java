//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
@SuppressWarnings("unchecked") class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int edges[][] = new int[m][3];
            for (int i = 0; i < m; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
                edges[i][2] = sc.nextInt();
            }
            Solution obj = new Solution();
            List<Integer> ans = obj.shortestPath(n, m, edges);
            for (int e : ans) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static List<Integer> shortestPath(int n, int m, int edges[][]) {
            List<List<Pair>> adj=new ArrayList<>();
            for(int i=0;i<n+1;i++) adj.add(new ArrayList<>());
            for(int a[]:edges){
                adj.get(a[0]).add(new Pair(a[1],a[2]));
                adj.get(a[1]).add(new Pair(a[0],a[2]));
            }   
            PriorityQueue<Pair> minhp=new PriorityQueue<>((a,b)->a.first-b.first);
            int[] dist = new int[n+1]; 
            int[] parent =new int[n+1]; 
            for(int i = 1;i<=n;i++) {
            dist[i] = (int)(1e9); 
            parent[i] = i; 
            }
            dist[1] = 0; 
            //pair contains node,weight of path
            minhp.add(new Pair(1,0));
            while(!minhp.isEmpty()){
                Pair temp=minhp.poll();
                int node=temp.first;
                int wt=temp.second;
                
                for(Pair it:adj.get(node)){
                    int adjnode=it.first;
                    int adjdist=it.second;
                    
                    if(adjdist+wt<dist[adjnode]){
                        dist[adjnode]=adjdist+wt;
                        minhp.add(new Pair(adjnode,dist[adjnode]));
                        parent[adjnode]=node;
                    }
                }
            }
                            List<Integer> path=new ArrayList<>();
                if(dist[n]==(int)1e9){
                    path.add(-1);
                    return path;
                }
                int cur=n;
                while(parent[cur]!=cur){
                    path.add(cur);
                    cur=parent[cur];
                }
                path.add(1);
                Collections.reverse(path); 
                 return path;
    }
    static class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
}