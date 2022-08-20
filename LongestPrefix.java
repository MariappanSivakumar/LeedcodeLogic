class Solution {
    public String longestCommonPrefix(String[] strs) {
       String s=strs[0];
        java.util.LinkedList<Character> list=new java.util.LinkedList<Character>();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            count=0;
            for(String word:strs)
                if(word.indexOf(s.charAt(i))>-1)
                    count++;
            if(count==strs.length)
                list.add(s.charAt(i));
            else break;
        }
        s="";
        for(char c:list)
            s+=String.valueOf(c);
        return s;
    }
}
