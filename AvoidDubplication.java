/*
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
*/
class Solution {  
    public int lengthOfLongestSubstring(String s) {
    int list[]=new int[s.length()];
        int zip=0;
      for(int i=0;i<s.length();i++)
      {
          char c=s.charAt(i);
          int count=0;
          for(int j=i+1;j<s.length();j++)
          {
              if(s.charAt(j)==c)
              {
                  list[zip++]=count;
                   count=0;
                  break;
              }
              count++;
          }
      }
        int counts=list[0];
        for(int i=1;i<zip;i++)
        {
            if(list[i]>counts)
                counts=list[i];
        }
        return counts+1;
    }
}
