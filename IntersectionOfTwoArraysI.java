/*
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        String temp=new String();
        int num[]=new int[0];
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j]&&temp.indexOf("("+nums1[i]+")")==-1)
                {
                    temp+="("+nums1[i]+")";
                    num=java.util.Arrays.copyOf(num,num.length+1);
                    num[num.length-1]=nums1[i];
                }
            }
        }
        return num;
    }
}
