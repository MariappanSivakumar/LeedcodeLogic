class Solution {
    public int sum(int n) {
        int sum = 0;
        for(;n!=0;n/=10) {
            sum += n%10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int max = -1;
        Map<Integer,Integer> map = new HashMap();
        for(int i : nums) {
            int sum = sum(i);
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            } else {
                int n = map.get(sum);
                max = Math.max(n+i, max);
                map.put( sum, n<i ? i : n);
            }
        }
        return max;
    }
}
