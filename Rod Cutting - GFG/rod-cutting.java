//{ Driver Code Starts
import java.io.*;
import java.util.*;

class RodCutting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Solution ob = new Solution();
            System.out.println(ob.cutRod(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution{
    public int cutRod(int price[], int n) {
        int l[]=new int[n];
        for(int i=1;i<=n;i++) l[i-1]=i;
        int dp[][]=new int[n+1][n+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0)dp[i][j]=0;
                else if(l[i-1]<=j){
                    //unbounded knapsack 
                    dp[i][j]=Math.max(price[i-1]+dp[i][j-l[i-1]],dp[i-1][j]);
                }
                else dp[i][j]=dp[i-1][j]; 
        }
    }
    return dp[n][n];
    }
}