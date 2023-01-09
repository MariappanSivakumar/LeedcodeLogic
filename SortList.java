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
    public ListNode sortList(ListNode head) {
        List<Integer> res = new ArrayList();
        sort(head, res);
        if(res.size() == 0)return null;
        java.util.Collections.sort(res);
        ListNode node  = new ListNode(res.get(res.size()-1));
        for(int i = res.size()-2;i>=0;i--){
            node = new ListNode(res.get(i),node);
        }   
        return node;
    }
     public void sort(ListNode node, List<Integer> res){
        if(node==null)return;
        res.add(node.val);
        sort(node.next, res);
    }
}
