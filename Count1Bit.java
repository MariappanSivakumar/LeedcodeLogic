/*
Example 1:

Input: n = 00000000000000000000000000001011
Output: 3
Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
Example 2:

Input: n = 00000000000000000000000010000000
Output: 1
Explanation: The input binary string 00000000000000000000000010000000 has a total of one '1' bit.

*/

public class Solution {
    public int hammingWeight(int n) {
        String value=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<value.length();i++)
        {
            if(value.charAt(i)=='1')
                count++;
        }
        return count;
    }
}
