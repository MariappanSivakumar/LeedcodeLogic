/*

*/

class Solution {
    boolean iscontains(String word1, String word2)
    {
        int left = 0, end = word1.length()-1;
        while(left<=end)
        {
            if(word2.indexOf(word1.charAt(left))==-1 && word2.indexOf(word1.charAt(end))==-1){}
            else return true;
            left++;
            end--;
        }
        return false;
    }
    public int maxProduct(String[] words) {
         int max = 0;
         for(int i=0;i<words.length-1;i++)
         {
             for(int j=i+1;j<words.length;j++)
             {
                 int temp = words[i].length() * words[j].length();
                 if(max<temp  && iscontains(words[i],words[j]) == false)
                 {
                     max = temp;
                 }
             }
         }
         return max;
    }
}
