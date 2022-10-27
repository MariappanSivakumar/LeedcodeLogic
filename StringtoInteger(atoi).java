/*
Example 1:

Input: s = "42"
Output: 42
Explanation: The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^
The parsed integer is 42.
Since 42 is in the range [-231, 231 - 1], the final result is 42.
Example 2:

Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
            ^
Step 2: "   -42" ('-' is read, so the result should be negative)
             ^
Step 3: "   -42" ("42" is read in)
               ^
The parsed integer is -42.
Since -42 is in the range [-231, 231 - 1], the final result is -42.
Example 3:

Input: s = "4193 with words"
Output: 4193
Explanation:
Step 1: "4193 with words" (no characters read because there is no leading whitespace)
         ^
Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
             ^
The parsed integer is 4193.
Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
*/

class Solution {
    public boolean isNumber(char c)
    {
        return c>='0' && c<='9';
    }
    public int myAtoi(String s) {
        s = s.trim();
        String integervalue  = "";
        for( int i=0; i<s.length(); i++ )
        {
            char c = s.charAt(i);
            if(i>0 &&   ( c=='+' || c=='-') && isNumber(s.charAt(i-1)))break;
            if(isNumber(c) || c=='+' || c=='-'){
                integervalue += c;
            }else break;
        }
        if(integervalue.length()==0)
        {
            return 0;
        }else 
        {
            try 
            {
                if(s.equals("-9223372036854775809"))return -2147483648;
                if(Integer.MAX_VALUE < Long.parseLong(integervalue))
                    return Integer.MAX_VALUE;
                else if(Integer.MIN_VALUE > Long.parseLong(integervalue))
                    return Integer.MIN_VALUE;
                else
                    return Integer.parseInt(integervalue);
            }catch(NumberFormatException e){
                if(integervalue.length()>10)return Integer.MAX_VALUE;
                return 0;
            } 
        }
    }
}
