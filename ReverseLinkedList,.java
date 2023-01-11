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
    public void addElements(ListNode head, List<Integer> res){
        if(head == null)return;
        res.add(head.val);
        addElements(head.next, res);
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<Integer> res = new ArrayList();
        addElements(head, res);
        while(left<right){
            int temp = res.get(left-1);
            res.set( left-1, res.get(right-1));
            res.set( right-1, temp);
            left++;
            right--;
        }
        head = null;
        for(int i = res.size()-1;i>=0;i--){
            head = new ListNode(res.get(i), head);
        }
        return head;
    }
}
