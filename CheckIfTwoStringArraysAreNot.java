/*
Example 1:

Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.
Example 2:

Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false
Example 3:

Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
*/
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstOne="";
        String secondOne="";
        for(String one:word1)
            firstOne+=one;
        for(String one:word2)
            secondOne+=one;
        if(firstOne.equals(secondOne))
            return true;
        else return false;
    }
}
