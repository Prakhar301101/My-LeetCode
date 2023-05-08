//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int d=sc.nextInt();
            
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            Solution obj=new Solution();
            int res=obj.countPartitions(n, d, arr);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//Back-end complete function Template for Java

class Solution{

    public int countPartitions(int n, int d, int arr[]){
        
        int s=0;
        for(int i:arr)s+=i;
        if((s+d)%2!=0) return 0;
        int sum=(s+d)/2;
          int m=1000000007;
	   int dp[][]=new int[n+1][sum+1];
	   //No subset for 0 length
	   for(int i=0;i<=sum;i++) dp[0][i]=0;
	    dp[0][0]=1;
	   
	   for(int i=1;i<=n;i++){
	       for(int j=0;j<=sum;j++){
	           dp[i][j]=dp[i-1][j];
	           if(arr[i-1]<=j){
	               dp[i][j]=(dp[i-1][j-arr[i-1]]+dp[i-1][j])%m;
	           }
	       }
	   }
	   return dp[n][sum]%m;

    }
    
}