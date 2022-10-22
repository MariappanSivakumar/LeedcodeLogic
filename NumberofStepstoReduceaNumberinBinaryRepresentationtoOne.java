/*
Example 1:

Input: s = "1101"
Output: 6
Explanation: "1101" corressponds to number 13 in their decimal representation.
Step 1) 13 is odd, add 1 and obtain 14. 
Step 2) 14 is even, divide by 2 and obtain 7.
Step 3) 7 is odd, add 1 and obtain 8.
Step 4) 8 is even, divide by 2 and obtain 4.  
Step 5) 4 is even, divide by 2 and obtain 2. 
Step 6) 2 is even, divide by 2 and obtain 1.  
Example 2:

Input: s = "10"
Output: 1
Explanation: "10" corressponds to number 2 in their decimal representation.
Step 1) 2 is even, divide by 2 and obtain 1. 
*/

class Solution {
    public int numSteps(String s) {
        java.math.BigInteger binarynumber = new java.math.BigInteger(s, 2);
        int count=0;
        while( !binarynumber.equals(new java.math.BigInteger("1")) )
        {
            count++;
            java.math.BigInteger modfun = new java.math.BigInteger("2");
            if( binarynumber.mod(modfun).equals( new java.math.BigInteger("1") ) )
            {
                binarynumber = binarynumber.add(new java.math.BigInteger("1"));
            }else
            {
                binarynumber = binarynumber.divide(new java.math.BigInteger("2"));
            }
        }
        return count;
    }
}
