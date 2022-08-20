/*
Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25

Time Limit Exceeded
Last executed input
0.00001
2147483647
*/


class Solution {
    public double myPow(double x, int n) {
        double d=1;
        if(n>=0)
        for(int i=0;i<n;i++)
            d*=Double.parseDouble(String.format("%.6f",x));
        else 
        {
            for(int i=0;i<Math.abs(n);i++)
                d*=Double.parseDouble(String.format("%.6f",x));
            d=1.0/d;
        }
        return d;
    }
}
