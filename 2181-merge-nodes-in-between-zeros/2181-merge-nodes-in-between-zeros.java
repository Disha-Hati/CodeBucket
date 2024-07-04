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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummyNode=new ListNode(0);
        ListNode current=dummyNode;
        
        int sum=0;
        
        head=head.next;
        
        while (head != null) {
            if (head.val == 0) {
                if (sum > 0) {  // Only add a new node if we have accumulated nodes
                    current.next = new ListNode(sum);
                    current = current.next;
                }
                sum = 0;  // Reset the sum for the next segment
            } else {
                sum += head.val;  // Accumulate the sum of values between zeros
            }
            
            head = head.next;  // Move to the next node
        }
        
        
        
        
        return dummyNode.next;
    }
}