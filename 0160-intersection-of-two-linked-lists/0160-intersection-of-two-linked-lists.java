/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       Set<ListNode> nodeVisit = new HashSet<>();

        ListNode curr1=headA;
        ListNode curr2=headB;
        while ( curr1 != null ) {
            nodeVisit.add(curr1);
            curr1 = curr1.next;
        }
    
        while ( curr2 != null ) {
            if ( nodeVisit.contains(curr2) ) {
                return curr2;
            } 
                curr2 = curr2.next;
        }
        return null;
    }
}