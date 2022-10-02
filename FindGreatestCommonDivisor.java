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
Example 3:

Input: nums = [3,3]
Output: 3
Explanation:
The smallest number in nums is 3.
The largest number in nums is 3.
The greatest common divisor of 3 and 3 is 3.
*/

class Solution {
    private int max(int num[])
    {
        int maxvalue=num[0];
        for(int i : num )
            if(maxvalue < i)
                maxvalue=i;
        return maxvalue;
    }
    private int min(int num[])
    {
        int minvalue=num[0];
        for(int i : num )
            if(minvalue > i)
                minvalue=i;
        return minvalue;
    }
    public int LCM(int n,int m)
    {
        for(int i=m;i>=0;i--)
            if(n%i==0 && m%i==0)
                return i;
        return 1;
    }
    public int findGCD(int[] nums) {
            Solution s=new Solution();

        return LCM(s.min(nums), s.max(nums));
    }
}
