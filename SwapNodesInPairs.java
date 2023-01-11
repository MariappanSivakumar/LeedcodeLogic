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

    public void travel(ListNode head, boolean flag){
        if(head == null)return;
        flag = !flag;
        travel(head.next, flag);
        if(head!=null && head.next!=null && !flag){
            int val = head.val;
            head.val = head.next.val;
            head.next.val = val;
        }
    }
    public ListNode swapPairs(ListNode head) {
        travel(head, true);
        return head;
    }
}
