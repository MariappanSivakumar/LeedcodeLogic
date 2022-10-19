/*
Example 1:

Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101
Example 2:

Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.
Example 3:

Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.
*/

class Solution {
    public boolean hasAlternatingBits(int n) {
        String binaryRepresentation = Integer.toBinaryString(n);
        for(int i=0;i<binaryRepresentation.length()-1;i+=1)
        {
            if(binaryRepresentation.charAt(i)==binaryRepresentation.charAt(i+1))return false;
        }
        return true;
    }
}
