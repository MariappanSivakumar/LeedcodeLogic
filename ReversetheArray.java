/*
  SAMPLE INPUT 1:
      
      INPUT  : {1,2,3,4,5,6,7}
      OUTPUT : {7,6,5,4,3,2,1}
      
  SAMPLE OUTPUT 2:
  
      INPUT : {3,4,5,9,2}
      OUTPUT: {2,9,5,4,3}
*/


class Solution {
    public void rotate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++)
        {
           for(int j=i+1;j<nums.length;j++)
           {
               int temp=nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
           }
        }
    }
}
