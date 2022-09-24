/*
Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true
*/
class Solution {
    public boolean isPowerOfFour(int n) {
        long count=4;
        if(n==1)
            return true;
        else
        {
            if(n%4==0)
            {
                while(true)
                {
                    if(n==count)
                        return true;
                    count=count*4;
                    if(n<count)
                        break;
                }
            }
        }
        return false;
    }
}
