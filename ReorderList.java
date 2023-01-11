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
    public void order(ListNode head, List<Integer> res, boolean flag, int left, int right){
        if(head == null)return;
        if(flag){
            head.val = res.get(right);
            right--; 
        } else {
            head.val = res.get(left);
            left++;
        }
        if(flag)flag = false;
        else flag = true;
        order(head.next, res, flag, left, right);
    }
    public void travel(ListNode head, List<Integer> res){
        if(head == null)return;
        travel(head.next, res);
        res.add(head.val);
    }
    public void reorderList(ListNode head) {
        List<Integer> res = new ArrayList();
        travel(head, res);
        order(head, res, true, 0, res.size()-1);
    }
}
