/*
 

Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1
*/
class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++)
        {
            int IN=0;
            for(int j=0;j<s.length();j++)
            {
                if(i!=j&&s.charAt(i)==s.charAt(j))
                {
                    IN=1;
                    break;
                }
            }
            if(IN==0)
                return i;
        }
        return -1;
    }
}
