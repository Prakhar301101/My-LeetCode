//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            int n =Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }
    
    public static void printList(Node head,PrintWriter out)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}




// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        List<Integer> v=new ArrayList<>();
        Node t=head;
        while(t!=null){
            v.add(t.data);
            t=t.next;
        }
        int n[]=new int[v.size()];
        for(int i=0;i<n.length;i++) n[i]=v.get(i);
        
        Node dummy=new Node(-1);
        Node p=dummy;
        //sort list(dutch flag parition) and create Linkedlist
        int p0=0,p1=0,p2=v.size()-1;
        while(p1<=p2){
         if(n[p1]==0){
               swap(n,p1,p0);
               p0++;p1++;
           }
           else if(n[p1]==1){
               p1++;
           }
           else if(n[p1]==2){
               swap(n,p1,p2);
               p2--;
           }
        }
        for(int i:n){
            Node temp=new Node(i);
            p.next=temp;
            p=p.next;
        }
       
        return dummy.next;
    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}


