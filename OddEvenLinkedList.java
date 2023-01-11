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
    public void addElements(ListNode head, List<Integer> list){
        if(head == null)return;
        addElements(head.next, list);
        list.add(head.val);
    }
    ListNode node;
    public ListNode oddEvenList(ListNode head) {
        List<Integer> list = new ArrayList();
        
        addElements( head, list);
    
        int first = 1;
        int second = 0;

        if(list.size()%2==0){
            first = 0;
            second = 1;
        }

        for(int i=first;i<list.size();i+=2){
            node = new ListNode(list.get(i), node);
        }
        for(int i=second;i<list.size();i+=2){
            node = new ListNode(list.get(i), node);
        }        
        return node;
    }
}
