/*
Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
*/
class Solution {
    public boolean isPowerOfTwo(int n) {
        long count=1;
        if(n%2==0||n==1)
        while(true)
        {
            if(count==n)
                return true;
            if(count>n)break;
            count+=count;
        }
        return false;
    }
}
