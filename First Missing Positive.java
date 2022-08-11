/*
Example 1:

Input: nums = [1,2,0]
Output: 3
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
*/
class Solution {
    public static int max(int[] a)
    {
        int temp=a[0];
        for(int i=0;i<a.length;i++)
            if(temp<a[i]&&a[i]<20)
                temp=a[i];
        return temp;
    }
    public int firstMissingPositive(int[] nums) {
        int n=max(nums),i,IN=0;
        System.out.println(n);
       for(i=1;i<n+1;i++)
       {
           IN=0;
           for(int j=0;j<nums.length;j++)
               if(nums[j]==i)
                   IN=1;
           if(IN==0)
               break;
       }
        return (int)i;
    }
}
