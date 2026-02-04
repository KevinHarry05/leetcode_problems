/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode first=head;
        ListNode tail=head;
        while(tail !=null && tail.next!=null)
        {
            head=head.next;
            tail=tail.next.next;
            if(head==tail)
            {
                return true;
            }
        }
        return false;


        
    }
}