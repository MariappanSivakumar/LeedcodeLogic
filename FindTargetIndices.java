/*
Example 1:

Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.
Example 2:

Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.
Example 3:

Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4.
*/

class Solution {
    public static int[] sort(int num[])
    {
        boolean f=false;
        for(int i=0;i<num.length-1;i++)
        {
            for(int j=0;j<num.length-i-1;j++)
                if(num[j]>num[j+1])
                {
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    f=true;
                }
            if(f==false)
                break;
        }
        return num;
    }
    public List<Integer> targetIndices(int[] nums, int target) {
       java.util.List<Integer> list=new java.util.LinkedList<Integer>();
        nums=Solution.sort(nums);
        for(int i=0;i<nums.length;i++)
            if(nums[i]==target)
                list.add(i);
        return list;
    }
}
