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
    int size = 0;
    public void size(ListNode head){
        if(head == null)return;
        size(head.next);
        size++;
    }
    ListNode node;
    int count = 0;
    public void remove(ListNode head, int ele){
        if(head == null)return;
        remove(head.next, ele);
        if(count != ele-1){
            node = new ListNode(head.val, node);
        }
        count++;
    }
    public ListNode deleteMiddle(ListNode head) {
        size(head);
        if(size % 2 != 0){
            remove(head, size/2+1);
        } else {
            remove(head, size/2);
        }
        return node;
    }
}
