/*
Example 1:

Input: sentence = "i love eating burger", searchWord = "burg"
Output: 4
Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
Example 2:

Input: sentence = "this problem is an easy problem", searchWord = "pro"
Output: 2
Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
*/

class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
     String ar[]=sentence.split(" ");
        int count=0;
        for(String value : ar)
        {
            count++;
            if(value.indexOf(searchWord)==0)
                return count; 
        }
        return -1;
    }
}
