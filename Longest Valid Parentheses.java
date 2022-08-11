/*
Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
*/


class Solution {
    public int longestValidParentheses(String s) {
        int open=0,close=0,in=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                open++;
                in++;
            }
            if(s.charAt(i)==')'&&in!=0)
            {
                close++;
                in--;
            }
        }
        in=(open>close)?close*2:open*2;   
        return Math.abs(in);
    }
}
