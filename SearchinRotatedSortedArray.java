/*
 Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
*/

class Solution {
    public int search(int[] nums, int target) {
        java.util.Map<Integer,Integer> map=new java.util.HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);
        int value=-1;
        if(map.get(target)!=null)value=map.get(target);
        return value;
    }
}
