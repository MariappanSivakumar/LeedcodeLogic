/*
Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
*/


class Solution {
    public String reverseWords(String s) {
        String word[]=s.split(" ");
        List<String> list = new ArrayList();
        String result = new String();
        for(int i=word.length-1;i>=0;i--)
        {
            result=word[i].trim();
            if(!result.equals(""))
                list.add(result+" ");
        }
        result="";
        list.set(list.size()-1, list.get(list.size()-1).trim());
        for(int i=0;i<list.size();i++)
        {
            result+=list.get(i);
        }
        return result;
    }
}
