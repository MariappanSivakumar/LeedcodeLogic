/*
 

Example 1:

Input: s = "abcd", t = "abcde"
Output: "e"
Explanation: 'e' is the letter that was added.
Example 2:

Input: s = "", t = "y"
Output: "y
*/

class Solution {
    public char findTheDifference(String s, String t) {
     
        char c[]=s.toCharArray();
        char c2[]=t.toCharArray();
        java.util.Arrays.sort(c);
        java.util.Arrays.sort(c2);
        
        for(int i=0;i<c2.length;i++)
        {
            if(i<c.length&&c[i]==c2[i]){}
            else return c2[i];
        }
            return c2[0];
    }
}
