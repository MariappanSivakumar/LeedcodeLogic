class Solution {
    int count;
    public void countBit(int n){
        if(n == 0)return;
        countBit(n>>1);
        if((n%2==1?1:0) == 1)count++;
    }
    public int hammingDistance(int x, int y) {
        countBit( x ^ y );
        return count;
    }
}
