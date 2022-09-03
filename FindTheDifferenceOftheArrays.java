/*
Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4,6]
Output: [[1,3],[4,6]]
Explanation:
For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].
Example 2:

Input: nums1 = [1,2,3,3], nums2 = [1,1,2,2]
Output: [[3],[]]
Explanation:
For nums1, nums1[2] and nums1[3] are not present in nums2. Since nums1[2] == nums1[3], their value is only included once and answer[0] = [3].
Every integer in nums2 is present in nums1. Therefore, answer[1] = [].
*/
class Solution {
    public static List<Integer> wordFilter(int nums1[],int nums2[])
    {
        java.util.List<Integer> list=new java.util.ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++)
        {
            int count=1;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    count++;
                }
            }
            if(count==1&&list.contains(nums1[i])==false)
                list.add(nums1[i]);
        }
        return list;
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
      java.util.List<List<Integer>> list=new java.util.ArrayList<List<Integer>>();
        list.add(new java.util.ArrayList(wordFilter(nums1,nums2)));
        list.add(new java.util.ArrayList(wordFilter(nums2,nums1)));
        return list;
    }
}
