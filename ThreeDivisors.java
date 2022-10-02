/*
Example 1:

Input: n = 2
Output: false
Explantion: 2 has only two divisors: 1 and 2.
Example 2:

Input: n = 4
Output: true
Explantion: 4 has three divisors: 1, 2, and 4.
*/

class Solution {
    public boolean isThree(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if( n%i==0 )
            {
                count++;
                if(count>3)return false;
            }
        }
        if(count==3)return true;
        else return false;
    }
}
