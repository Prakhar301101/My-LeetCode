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
    public ListNode deleteMiddle(ListNode head) {
         ListNode t1=head;
         ListNode t2=head;   
         int l=Count(t1);int mid=l/2+1;
        int c=1,p=1;   
        while(c!=mid){
            c++;
            t2=t2.next;
        }
        if(l==1){
            head=null;
            return head;
        }    
        if(c==l&&l!=1){
            ListNode temp=head;
            while(p!=l-1){
                p++;
                temp=temp.next;
            }
            temp.next=null;
            return head;
        }
        t2.val=t2.next.val;
        t2.next=t2.next.next;
        return head;
    }
    static int Count(ListNode head){
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
}