/*
Example 1:

Input: s = "barfoothefoobarman", words = ["foo","bar"]
Output: [0,9]
Explanation: Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively.
The output order does not matter, returning [9,0] is fine too.
Example 2:

Input: s = "wordgoodgoodgoodbestword", words = ["word","good","best","word"]
Output: []
*/


class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
         java.util.LinkedList<Integer> l=new java.util.LinkedList<Integer>();
        StringBuffer word=new StringBuffer(s);
        String temp[]=new String[words.length];
        s="";
        for(int incre=0;incre<words.length;incre++)
        {
            temp[incre]="";
            for(int i=0;i<words.length;i++)
                temp[incre]+=words[i];
           s=words[0];
           for(int i=0;i<words.length-1;i++)
               words[i]=words[i+1];
          words[words.length-1]=s;
       }
        for(int i=temp.length-1;i>=0;i--)
        {
            if(word.indexOf(temp[i])!=-1)
                l.add(word.indexOf(temp[i]));
        }
        return l;
    }
}
