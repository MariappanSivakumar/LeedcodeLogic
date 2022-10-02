/*
Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
*/

class Solution {
    public int firstMissingPositive(int[] nums) {
        java.util.Arrays.sort(nums);
        java.util.Set<Integer> setObj=new java.util.TreeSet<>();
        for(int i : nums )
            setObj.add(i);
        int n=0;
        for(int i : setObj )
            nums[n++]=i;
        nums=java.util.Arrays.copyOf(nums,setObj.size());
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=1)
            {
                if(count==nums[i])
                {
                    count++;
                }
                else return count;
            }
        }
        return count;
    }
}
