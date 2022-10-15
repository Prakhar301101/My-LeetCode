/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp1=head;
        ListNode temp2=head;
        int s=sizeList(head);
        int e=(s-n)+1;
        if(n==1&&s==1){
            return null;
        }
        if(e==s){
            int p1=1;
            while(p1!=e-1){
               temp2=temp2.next;
               p1++; 
            }
            temp2.next=null;
            return head;
        }
        int p=1;
        while(p!=e){
            temp1=temp1.next;
            p++;
        }
        temp1.val=temp1.next.val;
        temp1.next=temp1.next.next;
       return head;
    }
    public static int sizeList(ListNode head){
        int s=0;
        ListNode temp=head;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        return s;
    }
}