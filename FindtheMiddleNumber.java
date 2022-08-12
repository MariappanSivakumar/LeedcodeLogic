class Solution {
    public static double Median(int[] num)
    {
        double value=0;
        if (num.length % 2 == 0)
            value=(num[(num.length/2)]+num[(num.length/2)-1])/2.0;
        else
            value=num[Math.round(num.length / 2)];
        return value;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int temp[]=new int[nums1.length+nums2.length];
        int n=0;
        for(int i=0;i<nums1.length;i++)
            temp[n++]=nums1[i];
        for(int i=0;i<nums2.length;i++)
            temp[n++]=nums2[i];
        java.util.Arrays.sort(temp);
        return Median(temp);
    }
}
