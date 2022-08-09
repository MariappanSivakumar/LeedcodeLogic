/*
  SAMPLE INPUT 1:
      INPUT  : {4,-3,0,5,10};
      OUTPUT : {0,9,16,25,100}
*/
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++)
            nums[i]=Math.abs(nums[i])*Math.abs(nums[i]);
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]>nums[j])
                {
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
        return nums;
    }
}
