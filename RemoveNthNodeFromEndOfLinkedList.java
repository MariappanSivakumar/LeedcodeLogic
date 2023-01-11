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
    int count = 0;
    ListNode node;

    public void travel(ListNode head, int ignore){
        if(head == null)return;
        travel(head.next, ignore);
        count++;
        if(ignore != count){
            node = new ListNode(head.val, node);
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        travel(head, n);
        return node;
    }
}
