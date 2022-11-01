/*
Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
*/

class Solution {    
    public List<List<Integer>> threeSum(int[] nums) {
        java.util.Set<List<Integer>> set=new java.util.HashSet<List<Integer>>();
        java.util.Arrays.sort(nums);
        int length = nums.length;
        for(int i=0;i<length-1;i++)
        {
            for(int j=i+1;j<length;j++)
            {
               int temp = 0 - nums[i] - nums[j];
               int index = java.util.Arrays.binarySearch(nums,temp);
               if( index>=0 && index!=i && index!=j)
               {
                   java.util.List<Integer> l = new ArrayList();
                   l.add(nums[index]);
                   l.add(nums[i]);
                   l.add(nums[j]);
                   java.util.Collections.sort(l);
                   set.add(l);
               }else continue;
            }
        }
        java.util.List<List<Integer>> list = new java.util.ArrayList<List<Integer>>(set);
        return list;
    }
}
