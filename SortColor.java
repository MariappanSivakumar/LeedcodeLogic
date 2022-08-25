/*
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
*/
class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            boolean f=true;
            for(int j=0;j<nums.length-i-1;j++)
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    f=false;
                }
            if(f)break;
        }
    }
}
