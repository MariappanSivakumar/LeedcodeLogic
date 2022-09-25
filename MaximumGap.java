/*
Example 1:

Input: nums = [3,6,9,1]
Output: 3
Explanation: The sorted form of the array is [1,3,6,9], either (3,6) or (6,9) has the maximum difference 3.
Example 2:

Input: nums = [10]
Output: 0
Explanation: The array contains less than 2 elements, therefore return 0.
*/
class Solution {
    public int maximumGap(int[] nums) {
     java.util.Arrays.sort(nums);
        int max=0;
        if(nums.length!=0)
        for(int i=0;i<nums.length-1;i++)
        {
            int tempValueGet=Math.abs(nums[i]-nums[i+1]);
            if(max<tempValueGet)
                max=tempValueGet;
        }
        else return max;
        return max;
    }
}
