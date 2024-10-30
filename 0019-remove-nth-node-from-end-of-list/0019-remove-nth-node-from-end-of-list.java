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
        if(head==null)  return head;
        int size=0;
        
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        
        if(size==n) return head.next;
        
        ListNode target=head;
        for(int i=1;i<size-n;i++){
            target=target.next;
        }
        
        target.next=target.next.next;
        
        
        
        
        return head;
    }
}