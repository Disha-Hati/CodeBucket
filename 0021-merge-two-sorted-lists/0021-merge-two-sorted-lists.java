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
        ListNode ans=new ListNode(0);
        ListNode temp=ans;
        
        
        ListNode curr1=list1;
        ListNode curr2=list2;
        
        while(curr1!=null && curr2!=null){
            if(curr1.val<curr2.val){
                temp.next=curr1;
                temp=curr1;
                curr1=curr1.next;
            }else{
                temp.next=curr2;
                temp=curr2;
                curr2=curr2.next;
            }
        }
        
        if(curr1!=null) temp.next=curr1;
        
        if(curr2!=null)  temp.next=curr2;
               
        
        return ans.next;
    }
}