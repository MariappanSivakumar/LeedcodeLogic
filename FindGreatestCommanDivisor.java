/*
Example 1:

Input: nums = [2,5,6,9,10]
Output: 2
Explanation:
The smallest number in nums is 2.
The largest number in nums is 10.
The greatest common divisor of 2 and 10 is 2.
Example 2:

Input: nums = [7,5,6,8,3]
Output: 1
Explanation:
The smallest number in nums is 3.
The largest number in nums is 8.
The greatest common divisor of 3 and 8 is 1.
*/


class Solution {
    public static int LCM(int n,int m)
    {
        int ans=m;
        while(true)
            if(n%ans==0&&m%ans==0)break;
            else ans--;
        return ans;
    }
    public int findGCD(int[] nums) {
        int small=nums[0],big=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(small>nums[i])
                small=nums[i];
            if(big<nums[i])
                big=nums[i];
        }
        return LCM(big,small);
    }
}
