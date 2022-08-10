/*
Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
*/


class Solution {
    public int reverse(int x) {
        int sum=0;
        int value=x;
        if(x<0)
        for(int i=0;i<=(""+x).length();i++)
        {
            sum=(sum*10)+x%10;
            x/=10;
        }
        while(x>0)
        {
            sum=(sum*10)+x%10;
            x/=10;
            if(sum==value)
                break;
        }
            
        return sum;
    }
}
