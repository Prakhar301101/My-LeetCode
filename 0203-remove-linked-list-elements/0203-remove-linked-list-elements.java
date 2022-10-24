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
    public ListNode removeElements(ListNode head, int val) {
        ListNode t=head;
        ListNode fin=new ListNode();
        ListNode t1=fin;
        while(t!=null){
            if(t.val!=val)
            {
            ListNode c=new ListNode(t.val);
             t1.next=c;
             t1=t1.next;
             t=t.next;   
            }
           else
               t=t.next;
        }
        return fin.next;
    }
}