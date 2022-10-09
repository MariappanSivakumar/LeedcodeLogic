/*
Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
*/

class Solution {
    public int[] removeDuplicate(int[] numberContainer)
    {
        int count=0;
        numberContainer[count++]=numberContainer[0];
        for( int i=0; i<numberContainer.length-1; i++ )
        {
            if( numberContainer[i] != numberContainer[i+1] )
            {
                numberContainer[count++]=numberContainer[i+1];
            }
        }
        numberContainer=java.util.Arrays.copyOf(numberContainer,count);
        return numberContainer;
    }
    public int thirdMax(int[] nums) {
        java.util.Arrays.sort(nums);
        nums=new Solution().removeDuplicate(nums);
        if(nums.length>=3)
        return nums[nums.length-3];
        else return nums[nums.length-1];
    }
}
