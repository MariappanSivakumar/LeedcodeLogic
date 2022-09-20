/*
Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]

*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        java.util.List<Integer> list=new java.util.ArrayList<>();
       java.util.Arrays.sort(nums);
        for(int i=1;i<=nums.length;i++)
        {
            if(java.util.Arrays.binarySearch(nums,i)<0)
                list.add(i);
        }
        return list;
    }
}
