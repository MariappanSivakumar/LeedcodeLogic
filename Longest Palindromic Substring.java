/*
  Example 1:
    Input: s = "babad"
    Output: "bab"
    Explanation: "aba" is also a valid answer.
  Example 2:
    Input: s = "cbbd"
    Output: "bb"
*/


class Solution {
    public static boolean plaind(String s)
    {
        String temp=new String();
        for(int i=s.length()-1;i>=0;i--)
            temp+=s.charAt(i);
        if(temp.equals(s))
            return true;
        else return false;
    }
    public String longestPalindrome(String s) {
        String word=new String();
        String store[]=new String[s.length()];
        int zip=0;int min=0;
        for(int i=0;i<s.length();i++)
        {
            store[zip]=""+s.charAt(i);
            for(int j=i+1;j<s.length();j++)
            {
                store[zip]+=s.charAt(j);
                if(s.charAt(i)==s.charAt(j))
                    break;
            }
            if(!(plaind(store[zip])))
                zip++;
            else 
                if(min<store[zip].length())
                {
                    min=store[zip].length();
                    word=store[zip];
                }
        }
        return word;
    }
}
