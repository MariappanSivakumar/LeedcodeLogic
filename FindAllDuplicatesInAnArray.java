/*
Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        java.util.List < Integer > containsDuplicate = new java.util.ArrayList < Integer > ();
        java.util.Arrays.sort(nums);
        for( int i=0; i < nums.length-1; i++ )
        {
            if( nums[i] == nums[i+1] )
            {
                containsDuplicate.add(nums[i]);
            } 
        }
        return containsDuplicate;
    }
}
