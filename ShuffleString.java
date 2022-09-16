/*
Example 1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
*/

class Solution {
    public String restoreString(String s, int[] indices) {
        char character[]=new char[s.length()];
            for(int i=0;i<s.length();i++)
                    character[i]=s.charAt(i);
           for(int i=0;i<indices.length;i++)
                   for(int j=i+1;j<indices.length;j++)
                           if(indices[i]>indices[j])
                           {
                                   int temp=indices[i];
                                   indices[i]=indices[j];
                                   indices[j]=temp;
                                   char c=character[i];
                                   character[i]=character[j];
                                   character[j]=c;
                           }
            String returnvalue=new String();
            for(char ch:character)
                    returnvalue+=String.valueOf(ch);
            return returnvalue;
    }
}
