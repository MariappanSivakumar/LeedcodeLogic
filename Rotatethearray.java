/*SAMPLE INPUT 1:
      Input: nums = [1,2,3,4,5,6,7], k = 3
      Output: [5,6,7,1,2,3,4]
     */
class Solution {
    public void rotate(int[] nums, int k) {
        while(k!=0)
        {
            int first=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--)
                nums[j]=nums[j-1];
            nums[0]=first;
            k--;
        }
    }
}
