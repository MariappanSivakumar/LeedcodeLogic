/*
Example 1:

Input: n = 5
Output: 2
Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
Example 2:

Input: n = 7
Output: 0
Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
*/


class Solution {
    public static int convert(int value)
    {
        if(value==0)return 1;
        int res=0;
        int fac=1;
        while(value!=0)
        {
            res+= fac * ( value%2==0 ? 1 : 0 );

            fac*=2;

            value/=2;
        }
        return res;
    }
    public int bitwiseComplement(int n) {
        return convert(n);
    }
}
