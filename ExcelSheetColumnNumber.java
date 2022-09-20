/*
Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701
*/
class Solution {
    public int decodeCharacter(char c)
    {
        return ((int)c)-64;
    }
    public int titleToNumber(String columnTitle) {
        int answer=0,tracker=0;
        for(int i=columnTitle.length()-1;i>=0;i--)
        {
            int num=decodeCharacter(columnTitle.charAt(i));
            if(i!=columnTitle.length()-1)
            for(int j=0;j<tracker;j++)
                num*=26;
            answer+=num;
            tracker++;
        }
        return answer;
    }
}
