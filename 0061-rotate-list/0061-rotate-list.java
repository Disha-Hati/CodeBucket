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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null) return head;
        
        int size=1;
        ListNode curr=head;
        while(curr.next!=null){
            curr=curr.next;
            size++;
        }
        
        curr.next=head; 
        
        int last=size-(k%size);
        curr=head;
        for(int i=0;i<last-1;i++){
            curr=curr.next;
        }
        
        head=curr.next;
        curr.next=null;
        
        return head;
    }
}