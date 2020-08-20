/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next=head;
        ListNode prev = dummy;
        ListNode cur = head;
        while(cur!=null){
            while(cur.next!=null && prev.next.val==cur.next.val){
                cur=cur.next;
            }
            if(prev.next==cur) prev = prev.next;
            else prev.next=cur.next;
            cur=cur.next;
        }
        return dummy.next;
    }
}
