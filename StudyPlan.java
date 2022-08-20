/*
Example 1:

Input: nums = [1,3,5]
Output: 1
Example 2:

Input: nums = [2,2,2,0,1]
Output: 0
*/



class Solution {
    public int findMin(int[] nums) {
       int n=nums[0];
        for(int i=0;i<nums.length;i++)
            if(n>nums[i])
                n=nums[i];
        return n;
    }
}
