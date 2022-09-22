/*
Example 1:

Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
Output: true
Explanation:
s can be made by concatenating "i", "love", and "leetcode" together.
Example 2:

Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
Output: false
Explanation:
It is impossible to make s using a prefix of arr
*/
class Solution {
    public boolean isPrefixString(String s, String[] words) {
     String appendString=new String();
        for(String word : words)
        {
            appendString+=word;
            if(appendString.equals(s))
                return true;
        }
        return false;
    }
}
