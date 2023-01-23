class Solution {
    int count = 0;
    public void bitCount(int n){
        if(n == 0)return;
        bitCount(n>>1);
        count += n%2==0 ? 0 : 1;
    }
    class Count {
        int val, bit;
        public Count(int val, int bit){
            this.val = val;
            this.bit = bit;
        }
    }
    public int[] sortByBits(int[] arr) {
        Arrays.sort(arr);
        List<Count> list = new ArrayList();
        for(int i : arr){
            count = 0;
            bitCount(i);
            list.add(new Count(i, count));
        }
        java.util.Collections.sort(list, (Count i1, Count i2) -> {
            return i1.bit == i2.bit ? 0 : (i1.bit > i2.bit ? 1 : -1);
        });
        int count = 0;
        int dp[] = new int[arr.length];
        for(Count i : list){
            dp[count++] = i.val;
        }
        return dp;
    }
}
