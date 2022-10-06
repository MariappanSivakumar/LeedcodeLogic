/*
Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
*/

class Solution {
    public boolean isVowels(char c)
    {
        return c=='a' || c=='e' || c=='o' || c=='i' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ;
    }
    public String convertString(char c[])
    {
        String str=new String();
        for(int i=0;i<c.length;i++)
            str+=String.valueOf(c[i]);
        return str;
    }
    public String reverseVowels(String s) {
        int left=0,right=s.length()-1;
        char[] c=s.toCharArray();

        Solution solutionObj = new Solution();

        while(left<right)
        {
            if(solutionObj.isVowels(c[left])==false)left++;
            if(solutionObj.isVowels(c[right])==false)right--;

            if(solutionObj.isVowels(c[left])==true && solutionObj.isVowels(c[right])==true)
            {
                char character = c[left];
                c[left] = c[right];
                c[right] = character;
                left++;
                right--;  
            }
        }
        return solutionObj.convertString(c);
    }
}
