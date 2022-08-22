/*
Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
*/


class Solution {
    public int strStr(String haystack, String needle) {
    int index=0; 
    for(int i=0;i<haystack.length();i++)
     {
         index=-1;
        try
        {
         if(haystack.charAt(i)==needle.charAt(0))
         for(int j=0;j<needle.length();j++)
         {
            if(haystack.charAt(i+j)==needle.charAt(j))index++;
             else index--;
         }
        }catch(StringIndexOutOfBoundsException e){index=-1;}
         if(index==needle.length()-1)
         {
             index=i;
             break;
         }
     }
        return index;
    }
}
