/*
Example 1:

Input: s = "011101"
Output: 5 
Explanation: 
All possible ways of splitting s into two non-empty substrings are:
left = "0" and right = "11101", score = 1 + 4 = 5 
left = "01" and right = "1101", score = 1 + 3 = 4 
left = "011" and right = "101", score = 1 + 2 = 3 
left = "0111" and right = "01", score = 1 + 1 = 2 
left = "01110" and right = "1", score = 2 + 1 = 3
Example 2:

Input: s = "00111"
Output: 5
Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
Example 3:

Input: s = "1111"
Output: 3

*/
class Solution {
    public int zeroCount(String zero)
    {
        int count=0;
        for(int i=0;i<zero.length();i++)
        {
            if(zero.charAt(i) == '0' )count++;
        }
        return count;
    }
    public int oneCount(String one)
    {
        int count=0;
        for(int i=0;i<one.length();i++)
        {
            if(one.charAt(i) == '1' )count++;
        }
        return count;
    }
    public int maxScore(String s) {
        int max = 0;
       for( int i=1; i<s.length(); i++ )
       {
           System.out.println(s.substring(0,i) + " "+ s.substring(i));
           int maximum = zeroCount(s.substring(0,i)) + oneCount(s.substring(i));  
           if( max < maximum )max = maximum;
       } 
       return max;
    }
}
