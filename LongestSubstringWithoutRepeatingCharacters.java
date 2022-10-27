/*
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maximum = 0;
        String substring = "";
        for( int i=0; i<s.length(); i++ )
        {
            char c = s.charAt(i);
            if( substring.indexOf(c) == -1 )
            {
                substring+=c;
                if(maximum<substring.length())
                {
                    maximum = substring.length();
                    System.out.println(substring);
                }
            }
            else 
            {
                int index = substring.indexOf(c);
                substring = substring.substring(index+1,substring.length());
                substring+=c;
            }
        }
        return maximum;
    }
}
