/*
Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".
Example 2:

Input: s = "aa", p = "a*"
Output: true
Explanation: '*' means zero or more of the preceding element, 'a'. Therefore, by repeating 'a' once, it becomes "aa".
Example 3:

Input: s = "ab", p = ".*"
Output: true
Explanation: ".*" means "zero or more (*) of any character (.)".
*/

class Solution {
    public boolean isMatch(String s, String p) {
        boolean f=false;
        StringBuffer suf=new StringBuffer(p);
        for(int i=0;i<s.length();i++)
        {
            if(i<suf.length()&&suf.charAt(i)=='*')
            {
                suf.setCharAt(i,s.charAt(i));
                suf.append('*');
            }
            if(i<suf.length()&&suf.charAt(i)=='.')
                suf.setCharAt(i,s.charAt(i));
        }
        s+="*";
        if(!(s.equals(suf)||s.length()!=suf.length()))
            f=true;
        return f;
    }
}
