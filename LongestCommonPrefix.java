/*
Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String returnstring = "";
        for(int i=0;i<strs[0].length();i++)
        {
            boolean iscontain = true;
            for(int j=1;j<strs.length;j++)
            {
                if( i<strs[j].length() && strs[j].charAt(i) == strs[0].charAt(i)){}
                else
                {
                    iscontain = false;
                    break;
                } 
            }
            if(iscontain)returnstring+=strs[0].charAt(i);
            else break;
        }
        return returnstring;
    }
}
