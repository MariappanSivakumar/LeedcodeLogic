/*
Example 1:
Input: nums = [3,0,1]
Output: 2

Example 2:
Input: nums = [0,1]
Output: 2
*/


class Solution {
    public int missingNumber(int[] nums) {
        java.util.Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==count)count++;
            else break;
        return count;
    }
}
