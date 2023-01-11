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
    ListNode listnode;
    public void remove(ListNode node, int value){
        if(node == null)return;
        remove(node.next, value);
        if(node.val != value){
            listnode = new ListNode(node.val, listnode);
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        remove( head, val);
        return listnode;
    }
}
