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
        for(int i=0;i<nums.length;i++)
            for(int j=0;j<nums.length;j++)
                if(nums[j]==0)
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    j=nums.length;
                }
    }
}





// One more solution
class Solution {
    public void moveZeroes(int[] nums) {
     int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}
