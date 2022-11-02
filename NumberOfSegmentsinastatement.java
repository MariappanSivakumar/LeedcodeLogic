/*
Example 1:

Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
Example 2:

Input: s = "Hello"
Output: 1
*/
class Solution {
    public int countSegments(String s) {
        String words[] = s.split(" ");
        if(s.length()==0)return 0;
        int count = 0;
        for(int i=0;i<words.length;i++)
        {
            words[i] = words[i].trim();
            if(!words[i].equals(""))count++;
        }
        return count;
    }
}
