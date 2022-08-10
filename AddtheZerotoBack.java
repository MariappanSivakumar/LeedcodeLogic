 /*
  Example 1:
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
  Example 2:
    Input: nums = [0]
    Output: [0]
*/
class Solution {
    public void moveZeroes(int[] nums) {
        int zero=0;
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]>nums[j])
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
        for(int i=0;i<nums.length;i++)
            if(nums[i]==0)
                zero++;
        for(int incre=0;incre<zero;incre++)
        {
           int temp=nums[0];
           for(int i=0;i<nums.length-1;i++)
               nums[i]=nums[i+1];
           nums[nums.length-1]=temp;

        }
    }
}
