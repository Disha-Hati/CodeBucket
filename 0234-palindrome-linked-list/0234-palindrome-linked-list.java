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
    
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode prev=head;
        ListNode curr=head.next;
        
        while(curr!=null){
            ListNode next=curr.next;
            
            curr.next=prev;
            
            prev=curr;
            curr=next;
        }
        
        head.next=null;
        return prev;
    }
    public ListNode findMid(ListNode head){
        ListNode turtle=head;
        ListNode hare=head;
        
        while(hare.next!=null && hare.next.next!=null){
            hare=hare.next.next;
            turtle=turtle.next;
        }
        
        return turtle;
    }
    
    
    public boolean isPalindrome(ListNode head) {
        if(head==null||head.next==null){
            return true;
        }
        
        ListNode midnode=findMid(head);
        ListNode secondHead=reverse(midnode.next);
        ListNode firstHead=head;
        
        while(secondHead!=null){
            if(firstHead.val!=secondHead.val){
                return false;
            }
            firstHead=firstHead.next;
            secondHead=secondHead.next;
        }
        
        return true;
        
    }
}