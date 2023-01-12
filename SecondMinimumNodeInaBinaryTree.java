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
    public void min(TreeNode root){
        if(root == null)return;

        min(root.left);
        min(root.right);
        list.add(root.val);
    }
    public int findSecondMinimumValue(TreeNode root) {
        min(root);
        java.util.Collections.sort(list);

        int min = list.get(0);
        for(int i=1;i<list.size();i++){
            if(min<list.get(i)){
                return list.get(i);
            }
        }
        return -1;
    }
}
