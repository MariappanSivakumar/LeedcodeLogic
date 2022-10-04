/*
Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
*/

class Solution {
    public int singleNumber(int[] nums) {
        java.util.Arrays.sort(nums);
        int count=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                count++;
            else
            {
                if(count==1)
                return nums[i];
                count=1;
            } 
        }
        return nums[nums.length-1];
    }
}
