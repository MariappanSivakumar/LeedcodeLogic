/*
Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
*/
class Solution {
    public static int maxValue(java.util.List<Integer> list)
    {
        int max=list.get(0);
        for(int i=1;i<list.size();i++)
        {
            if(max<list.get(i))
                max=list.get(i);
        }
        return max;
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        java.util.List<Integer> list=new java.util.ArrayList<>();
        for(int i:nums)
        {
            if(i==1)
                count++;
            else 
            {
                list.add(count);
                count=0;
            }
        }
        if(count!=0)
            list.add(count);
        return maxValue(list);
    }
}
