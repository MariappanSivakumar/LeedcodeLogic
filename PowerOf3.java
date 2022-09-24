/*
Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
Example 3:

Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).
*/

class Solution {
    public boolean isPowerOfThree(int n) {
        long count=3;
        if(n==1)
            return true;
        else
        if(n%3==0)
        {
            while(true)
            {
               if(count==n)
                   return true;
                count=count*3;
                if(count>n)
                    break;
            }
        }
        return false;
    }
}
