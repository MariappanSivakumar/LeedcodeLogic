/*
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
*/

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int num[]=new int[0];
        if(nums1.length<=nums2.length)
        {
            for(int i=0;i<nums1.length;i++)
                for(int j=0;j<nums2.length;j++)
                    if(nums1[i]==nums2[j])
                    {
                        nums2[j]=1001;
                        num=java.util.Arrays.copyOf(num,num.length+1);
                        num[num.length-1]=nums1[i];
                        break;
                    }
        }
        else 
        {
            for(int i=0;i<nums2.length;i++)
                for(int j=0;j<nums1.length;j++)
                    if(nums2[i]==nums1[j])
                    {
                        nums1[j]=1001;
                        num=java.util.Arrays.copyOf(num,num.length+1);
                        num[num.length-1]=nums2[i];
                        break;
                    }
        }
        return num;
    }
}
