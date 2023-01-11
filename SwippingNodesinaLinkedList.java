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
    
    public void size(ListNode head, List<Integer> result){
        if(head == null)return;
        size(head.next, result);
        result.add(head.val);
    }
    public ListNode swapNodes(ListNode head, int k) {
        List<Integer> result = new ArrayList();
        size(head, result);
        int temp = result.get(k-1);
        result.set(k-1, result.get(result.size()-k));
        result.set(result.size()-k, temp);
        head = null;

        for(int i : result){
            head = new ListNode(i, head);
        }
        return head;  
    }
}
