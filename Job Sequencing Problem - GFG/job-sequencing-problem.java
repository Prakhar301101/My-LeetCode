//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        int jobdone=0,maxprf=0;
       int prf[]=new int[n];Arrays.fill(prf,-1);
       Arrays.sort(arr,(a,b)->b.profit-a.profit);
       for(Job it:arr){
           if(prf[it.deadline-1]==-1){
               prf[it.deadline-1]=it.id;
               jobdone++;
               maxprf+=it.profit;
           }
           else if(prf[it.deadline-1]!=-1){
               for(int j=it.deadline-2;j>=0;j--){
                   if(prf[j]==-1){
                       prf[j]=it.id;
                       jobdone++;
                       maxprf+=it.profit;
                        break;
                   }
               }
           }
       }
       return new int[]{jobdone,maxprf};
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/