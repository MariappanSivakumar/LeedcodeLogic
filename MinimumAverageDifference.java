class Solution {
    public int minimumAverageDifference(int[] nums) {

        if(nums.length == 1)return 0;

        long sum = 0;
        for(int i : nums) {
            sum += i;
        }

        long left = 0;
        long leng = nums.length;
        long difference = Integer.MAX_VALUE;
        long index = 0;

        for(int i=0; i < nums.length; i++ ) {
            
            left += nums[i];
            sum -= nums[i];

            long l = left / (i+1);
            long r = leng - i - 1 == 0 ? 0 : sum / (leng - i - 1);

            long diff = Math.abs( l - r );

            if(diff == 0)return i;

            if(diff < difference) {
                difference = diff;
                index = i;
            }

        }

        return (int)index;

    }
}
