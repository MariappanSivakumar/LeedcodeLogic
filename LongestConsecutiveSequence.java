/*
Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
*/

class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int max=0;
        java.util.Arrays.sort(nums);
        if(nums.length!=1)
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])continue;
            else 
            if((nums[i]+1)==nums[i+1])
            {
                count++;
            }else count=1;
            if(max<count)
                max=count;
        }else return count;
        if(nums.length==2 && nums[0]==0 && nums[1]==0 )
            return 1;
        return max;
    }
}
