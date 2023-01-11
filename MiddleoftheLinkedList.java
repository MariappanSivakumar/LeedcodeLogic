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

    public void add(ListNode head, List<Integer> res){
        if(head == null)return;
        res.add(head.val);
        add(head.next, res);
    }
    ListNode node;
    public ListNode middleNode(ListNode head) {
        List<Integer> list = new ArrayList();
        add(head,list);
        int leng = list.size();
        for(int i=leng-1;i>=leng/2;i--){
            node = new ListNode(list.get(i), node);
        }
        return node;
    }
}
