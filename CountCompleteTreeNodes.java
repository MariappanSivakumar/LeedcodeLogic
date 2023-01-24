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
    int count = 0;
    public void travel(TreeNode root){
        if(root == null)return;

        travel(root.left);
        travel(root.right);
        count++;
    }
    public int countNodes(TreeNode root) {
        travel(root);
        return count;
    }
}
