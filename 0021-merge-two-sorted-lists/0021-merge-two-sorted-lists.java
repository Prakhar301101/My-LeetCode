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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode();
        ListNode t=head;
        
        ListNode t1=list1;ListNode t2=list2;
        while(t1!=null&&t2!=null){
            if(t1.val<=t2.val){
                ListNode c=new ListNode(t1.val);
                t.next=c;
                t=t.next;
                t1=t1.next;
            }
            else if(t2.val<t1.val){
                ListNode c=new ListNode(t2.val);
                t.next=c;
                t=t.next;
                t2=t2.next;
            } 
        }
        while(t1!=null){
            ListNode c=new ListNode(t1.val);
                t.next=c;
                t=t.next;
                t1=t1.next;
        }
        while(t2!=null){
           ListNode c=new ListNode(t2.val);
                t.next=c;
                t=t.next;
                t2=t2.next; 
        }
        return head.next;
    }
}