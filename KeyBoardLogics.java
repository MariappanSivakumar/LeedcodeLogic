/*

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
Example 2:

Input: words = ["omk"]
Output: []
Example 3:

Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]
*/

class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiopQWERTYUIOP";
        String secondRow = "asdfghjklASDFGHJKL";
        String thridRow = "zxcvbnmZXCVBNM";

        String[] validWords = new String[0];
        for(int i=0;i<words.length;i++)
        {
            int IN=0;
            String row="";
            if(firstRow.indexOf(words[i].charAt(0))!=-1)row=firstRow;
            else if(secondRow.indexOf(words[i].charAt(0))!=-1) row=secondRow;
            else row=thridRow;
            for(int j=0;j<words[i].length();j++)
            {
                if(row.indexOf(words[i].charAt(j))==-1)
                {
                    IN=1;
                    break;
                }
            }
            if( IN == 0 )
            {
                validWords = java.util.Arrays.copyOf(validWords,validWords.length+1);
                validWords[validWords.length-1]= words[i];
            }
        }
        return validWords;
    }
}
