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
    int carry;
    public void travel(ListNode one, ListNode two){
        if(one==null)return;
        travel(one.next, two.next);
        int sum = one.val + two.val + carry ;
        if(sum>9){
            carry = sum/10;
            sum%=10;
        } else carry = 0;
        node = new ListNode(sum, node);
    }
    int count;
    public void size(ListNode node){
        if(node == null)return;
        size(node.next);
        count++;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        size(l1);
        int firS = count;
        count = 0;
        size(l2);
        int secS = count;
        if(firS<secS){
            for(int i = firS;i<secS;i++){
                l1 = new ListNode(0, l1);
            }
        } else if(secS<firS){
            for(int i = secS;i<firS;i++){
                l2 = new ListNode(0, l2);
            }
        }
        travel(l1, l2);
        if(carry!=0)node = new ListNode(carry, node);
        return node;
    }
}
