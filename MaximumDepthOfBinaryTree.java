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
    int max = 0;
    public void travel(TreeNode root, int dept){
        if(root == null){
            if(dept>max){
                max = dept;
            }
            return;
        }
        travel(root.left, dept+1);
        travel(root.right, dept+1);
    }
    public int maxDepth(TreeNode root) {
        travel(root, 0);
        return max;
    }
}
