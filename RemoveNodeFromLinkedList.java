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
    ListNode node;
    int val = 0;
    public void addElements(ListNode head){
        if(head == null)return;
        addElements(head.next);
        if(node == null){
            val = head.val;
            node = new ListNode(val, node);
        } else if(val<=head.val){
            node = new ListNode(head.val, node);
            val = head.val;
        }
    }
    public ListNode removeNodes(ListNode head) {
        addElements(head);
        return node;
    }
}
