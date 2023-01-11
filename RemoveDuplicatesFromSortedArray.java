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
    public void addElements(ListNode head, Map<Integer, Integer> res){
        if(head == null)return;
        addElements(head.next, res);
        if(!res.containsKey(head.val)){
            res.put(head.val, 1);
        } else {
            res.put(head.val, res.get(head.val)+1);
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> res = new LinkedHashMap();
        addElements( head, res);
        System.out.println(res);
        for(Map.Entry<Integer,Integer> entry : res.entrySet()){
            if(entry.getValue() == 1){
                node = new ListNode(entry.getKey(), node);
            }
        }
        return node;
    }
}
