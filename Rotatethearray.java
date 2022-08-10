/*SAMPLE INPUT 1:
      Input: nums = [1,2,3,4,5,6,7], k = 3
      Output: [5,6,7,1,2,3,4]
     */
class Solution {
    public void rotate(int[] nums, int k) {
       for(int incre=-1;incre<k;incre++)
       {
           int temp=nums[0];
           for(int i=0;i<nums.length-1;i++)
               nums[i]=nums[i+1];
           nums[nums.length-1]=temp;
       }
    }
}
