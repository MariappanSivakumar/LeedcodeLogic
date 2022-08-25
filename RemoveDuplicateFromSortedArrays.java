class Solution {
    public int removeDuplicates(int[] nums) {
       for(int i=0;i<nums.length;i++)
           for(int j=i+1;j<nums.length;j++)
               if(nums[i]==nums[j])
                   nums[j]=101;
        java.util.Arrays.sort(nums);
        int count=0;
        for(int i:nums)
            if(i!=101)
                count++;
        return count;
    }
}
