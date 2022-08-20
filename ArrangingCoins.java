/*
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
*/
class Solution {
    public int arrangeCoins(int n) {
       long count=0;
        int i;
        for(i=1;i<=n;i++)
            if(n<(count+=i))
                break;
        return i-1;
    }
}
