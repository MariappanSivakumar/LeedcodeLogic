/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> list = new ArrayList();
    public void travel(TreeNode node){
        if(node == null)return;
        travel(node.left);
        list.add(node.val);
        travel(node.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        travel(root);
        return list;
    }
}
