/*
Example 1:

Input: nums = [1,2,3,3]
Output: 3
Example 2:

Input: nums = [2,1,2,5,3,2]
Output: 2
Example 3:

Input: nums = [5,1,5,2,5,3,5,4]
Output: 5
*/
class Solution {
    public int repeatedNTimes(int[] nums) {
       int ans=0;
        for(int i=0;i<nums.length;i++)
           for(int j=0;j<nums.length;j++)
               if(i!=j&&nums[i]==nums[j])
               {
                 ans=nums[i];
                   break;
               }
        return ans;
    }
}
