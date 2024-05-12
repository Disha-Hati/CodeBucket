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
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        
        if (n==size){
            return head.next;
        }
        
        int prevToN=size-n;
        ListNode temp=head;
        
        int i=1;
        while(i<prevToN){
            temp=temp.next;
            i++;
        }
        
        temp.next=temp.next.next;
        
        return head;
    }
}