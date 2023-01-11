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
    private int val = 1;
    private int binary = 0;
    public void convertBinary(ListNode head){
        if(head == null)return;
        convertBinary(head.next);
        if(head.val == 1){
            binary += val;
        }
        val+=val;
    }
    public int getDecimalValue(ListNode head) {    
        convertBinary(head);
        return binary;    
    }
}
