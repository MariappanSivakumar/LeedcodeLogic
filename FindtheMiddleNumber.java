/*
  Example 1:
      Input: nums1 = [1,3], nums2 = [2]
      Output: 2.00000
      Explanation: merged array = [1,2,3] and median is 2.
  Example 2:
      Input: nums1 = [1,2], nums2 = [3,4]
      Output: 2.50000
      Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      double sum=0;
        int n=nums1.length+nums2.length;
        for(int i=0;i<nums1.length;i++)
            sum+=nums1[i];
        for(int i=0;i<nums2.length;i++)
            sum+=nums2[i];
        return (sum/n);
    }
}
