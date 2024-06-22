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
       Set nodeVisit = new HashSet<>();

        while ( headA != null ) {
            nodeVisit.add(headA);
            headA = headA.next;
        }
    
        while ( headB != null ) {
            if ( nodeVisit.contains(headB) ) {
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;
    }
}