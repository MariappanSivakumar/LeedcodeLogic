/*
Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        java.util.Arrays.sort(c1);
        java.util.Arrays.sort(c2);
        if(c1.length!=c2.length)
        {
            return false;
        }
        else 
        {
            for(int i=0;i<c1.length;i++)
            {
                if(c1[i]!=c2[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
