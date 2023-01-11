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
    public boolean isExe(ListNode iter, int val){
        if(iter == null)return false;
        if(iter.val == val){
            return true;
        }
        isExe(iter.next, val);
        return false;
    }
    ListNode node;
    public void remove(ListNode head){
        if(head == null)return;
        remove(head.next);
        if(node==null){
            node = new ListNode(head.val, node);
        }
        else {
            ListNode iter = node;
            if(!isExe(iter, head.val)){
                node = new ListNode(head.val, node);
            }
        } 
    }
    public ListNode deleteDuplicates(ListNode head) {
        remove(head);
        return node;        
    }
}
