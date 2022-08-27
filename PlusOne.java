/*
Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0]
*/


class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        digits[digits.length-1]++;
        for(int i=digits.length-1;i>=0;i--)
        {
            digits[i]=digits[i]+carry;
            System.out.println(digits[i]);
            if(digits[i]>9)
            {
                digits[i]=0; 
                carry=1;
                if(carry==1&&i==0)
                {
                    digits=java.util.Arrays.copyOf(digits,digits.length+1);
                    digits[0]=carry;
                }
            }
            else carry=0;
        }
        return digits;
    }
}
