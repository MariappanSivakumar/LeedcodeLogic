/*  SAMPLE INPUT 1:
      Input: nums = [-1,0,3,5,9,12], target = 9
      Output: 4
      Explanation: 9 exists in nums and its index is 4
      
    SAMPLE INPUT 2:
      Input: nums = [-1,0,3,5,9,12], target = 4
      Output: -1
      Explanation: 4 exists in nums and its index is -1
*/
class Solution {
    public int search(int[] nums, int target) {
        int returnvalue=-1;
        for(int i=0;i<nums.length;i++)
            if(nums[i]==target)
                returnvalue=i;
        return returnvalue;
    }
}
